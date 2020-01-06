package com.lanou.simple.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcConller {
  @RequestMapping("/")
    public  String index(Model model){
        model.addAttribute("name","欢迎进入");
        return "index";
    }

    @RequestMapping("/header")
    public String getReqHeader(@RequestHeader("User-Agent") String userAgent, Model model) {
        model.addAttribute("userAgent", userAgent);
        return "index";
    }


}
