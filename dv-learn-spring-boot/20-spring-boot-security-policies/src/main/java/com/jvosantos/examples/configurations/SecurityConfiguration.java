package com.jvosantos.examples.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Autowired
  public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder
        .inMemoryAuthentication()
          .withUser("vasco").password("password").roles("ADMIN")
          .and().withUser("joe").password("password").roles("USER");
  }

  @Override
  public void configure(HttpSecurity httpSecurity) throws Exception {
    // order matters: should be form least secured to most secured policy
    httpSecurity.authorizeRequests()
        .antMatchers("/posts/list").permitAll()
        .antMatchers("/admin/**").hasRole("ADMIN")
        .anyRequest().authenticated()
        .and().formLogin()
        .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
  }
}
