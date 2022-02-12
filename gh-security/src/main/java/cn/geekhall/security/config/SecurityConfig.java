package cn.geekhall.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SecurityConfig
 *
 * @author yiny
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .usernameParameter("username123")
                .passwordParameter("password123")
                .loginProcessingUrl("/login")
                // 自定义登录页面
                .loginPage("/login.html")
                // 登录成功跳转
                .successForwardUrl("/home")
                // 登录失败跳转
                .failureForwardUrl("/error");

        // 授权认证
        http.authorizeRequests()
                // error.html 不需要授权
                .antMatchers("/error.html").permitAll()
                // login.html 不需要授权
                .antMatchers("/login.html").permitAll()
                // 其他所有页面都需要授权
                .anyRequest().authenticated();
    }

    @Bean
    public PasswordEncoder getPassword() {
        return new BCryptPasswordEncoder();
    }
}
