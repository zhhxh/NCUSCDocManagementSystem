package com.ncusc.dms.config;

import com.ncusc.dms.service.user.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * 配置Spring Security
 *
 * @author WANGHAO
 * @version 1.0.0
 *
 */
@Configuration
// Use Spring Security
@EnableWebSecurity
//Use Annotation
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * http权限控制
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/root/**").hasRole("ROOT")
                .antMatchers("/admin/**").hasAnyRole("ADMIN","ROOT")
                .antMatchers("/user/**").hasAnyRole("ADMIN","USER","ROOT")
                .anyRequest().permitAll()
            .and()
                .formLogin()
                .loginPage("/login")
                .failureForwardUrl("/loginError").permitAll()
            .and()
                .logout().permitAll()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true)
            .and()
                .httpBasic();
    }


    @Autowired
    UserAccountService userAccountService;

    /**
     * 用户验证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userAccountService)
                //TODO 这里使用了不加密的密码，需要选用加密算法对密码进行加密
                .passwordEncoder(new NoEncryptedPasswordEncoder());
    }

}