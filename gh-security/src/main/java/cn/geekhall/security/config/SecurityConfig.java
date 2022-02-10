package cn.geekhall.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SecurityConfig
 *
 * @author yiny
 */
@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder getPassword() {
        return new BCryptPasswordEncoder();
    }
}
