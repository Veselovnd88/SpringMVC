package ru.veselov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")//запрос при переходе будем попадать в этот метод
    public String helloPage(@RequestParam(value = "name",required = false) String name,
                            @RequestParam(value = "surname",required = false)String surName,
                            Model model){   //HttpServletRequest request){Добавляем модель из спринга
        //String name = request.getParameter("name");
        //String surName = request.getParameter("surname");
        //в модель добавляем значение-ключ (message - и ту строку которую мы получили с гет запроса
        System.out.println("Hello "+name+" "+surName);
        model.addAttribute("message","Hello "+name+" "+surName);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public String calc(@RequestParam(value = "a") String a,
                       @RequestParam(value = "b") String b,
                       @RequestParam(value = "operation") String operation,
                       Model model){
        int result=0;
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        switch (operation){
            case "multiplication":
                result =aInt*bInt;
                break;
            case "addition":
                result = aInt+bInt;
                break;
            case "subtraction":
                result = aInt-bInt;
                break;
            case "division":
                result = aInt/bInt;
                break;
        }
        String message = "Result "+operation+": "+a+" and "+ b+" is "+result;
        model.addAttribute("calcResult", message);
        return "first/calculator";
    }
}
