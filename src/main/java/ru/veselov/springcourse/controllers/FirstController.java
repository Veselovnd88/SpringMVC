package ru.veselov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")//запрос при переходе будем попадать в этот метод
    public String helloPage(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "surname",required = false)String surName){   //HttpServletRequest request){
        //String name = request.getParameter("name");
        //String surName = request.getParameter("surname");

        System.out.println(name+" "+surName);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
