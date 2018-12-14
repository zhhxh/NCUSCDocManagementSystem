package com.ncusc.dms.controllers.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String Login(ModelAndView mav){
        return "login/login";
    }
    @RequestMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login/login";
    }
}
