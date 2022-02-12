package cn.geekhall.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GhSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhSecurityApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Spring Security!") String name) {
        return String.format("Hello %s!", name);
    }

}
