package cn.geekhall.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController
 *
 * @author yiny
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "Hello Spring Security!";
    }


}
