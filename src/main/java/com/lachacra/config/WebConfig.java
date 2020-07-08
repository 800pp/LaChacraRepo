package com.lachacra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/").permitAll();


    }

    /*

    .antMatchers("/h2-console/**", "/registration").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .defaultSuccessUrl("/menu")
                .failureForwardUrl("/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutSuccessUrl("/login.html?logout")
                .and()
                .csrf().ignoringAntMatchers("/h2-console/**")
                .and()
                .headers().frameOptions().sameOrigin()
        ;


      http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/favicon.ico").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/static/**").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/blog/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/index")
                .permitAll()
                .and()
                .logout()
                .permitAll();

     */

}
