package cn.geekhall.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginController
 *
 * @author YinYang
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login() {
        System.out.println("执行登录方法");
        return "redirect:main.html";
    }

    @RequestMapping("home")
    public String home(){
        System.out.println("执行 home 方法");
        return "redirect:main.html";
    }

    @RequestMapping("error")
    public String error(){
        System.out.println("执行 error 方法");
        return "redirect:error.html";
    }

}
