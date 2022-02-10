package cn.geekhall.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class GhSecurityApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder pe = new BCryptPasswordEncoder();
        String encode = pe.encode("123");
        System.out.println("============= password ===============");
        System.out.println(encode);
        System.out.println("============= password ===============");
        boolean matches = pe.matches("123", encode);
        System.out.println(matches);
    }

}
