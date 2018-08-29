package com.xz.blog.controller;

import com.xz.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
//@ResponseBody
//testController返回的不是页面,Controller返回的是页面  testController=Controller + ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    public String selectUser (@PathVariable int id,Model model){
        model.addAttribute("name", userService.selectUser(id).toString());
        return "greets";

    }
    @RequestMapping("/showUser/all")
    public String selectAllUser(){
        return userService.selectAllUser().toString();

    }
    @RequestMapping("/name")
    public String name() {
        System.out.println("============================================");
        return "hello";
    }

    /**
    @RequestMapping("/greet")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "greets";
    }
    **/

}