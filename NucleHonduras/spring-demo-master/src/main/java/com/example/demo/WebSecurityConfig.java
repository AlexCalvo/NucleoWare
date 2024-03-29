package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;
import com.example.demo.model.UserRepositoryDetailsService;
import com.example.demo.model.UserService;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// configura las urls que por defecto estan disponibles sin autenticacion
		http.authorizeRequests()
				// permitimos estas urls sin autenticacion
				// console se usa para poder acceder a la pagina de configuracion de la base de
				// datos
				// permitir que ignore los ficheros de la carpeta css para evitar problemas de redireccion
				// si se anaden mas ficheros como librerias javascripts, anadirlos a la carpeta /lib 
				.antMatchers("/", "/console/**", "/css/**", "/js/**").permitAll().anyRequest().authenticated()

				.and()

				.formLogin().loginPage("/login").permitAll()

				.and()

				.logout().logoutSuccessUrl("/").permitAll();

		// solo usar durante la fase de desarrollo para poder acceder a la pagina de
		// administracion de la base de datos
		// despues comentar estas lineas
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth, UserRepositoryDetailsService userDetailsService,
			UserRepository userRepository) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());


		// Crear usuario por defecto
		User user = new User((long)1, "Alan", "Wake", "admin@admin.com", "admin", null,null,null,null);
		
		// la contraseña es test (encriptada usando bcrypt)
		// https://www.dailycred.com/article/bcrypt-calculator
		user.setPassword("admin");
		
		
		if (userRepository.findByEmail(user.getEmail()) == null) {
			userRepository.save(user);
		}
		
		
		
	}
}
