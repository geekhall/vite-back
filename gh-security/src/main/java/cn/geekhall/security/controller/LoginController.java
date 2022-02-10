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
}
