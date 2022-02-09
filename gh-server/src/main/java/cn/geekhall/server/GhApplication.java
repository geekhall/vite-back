package cn.geekhall.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * GhApplication.java
 *
 * @author yiny
 */
@SpringBootApplication
@MapperScan("cn.geekhall.server.mapper")
public class GhApplication {
    public static void main(String[] args) {
        SpringApplication.run(GhApplication.class, args);
    }
}
