package ru.veselov.springcourse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
///RequestMappin("/people") - всех ссылки должны начинаться с пипл
public class HelloController {//аннотация наследуется от компоннент
    //создается бин из этого класса, тот же компонент, но с доп возможностями
    /*
    * 5 видов маппинга - гет, пост, пут,делит, патч
    * раньше был реквест маппинг и в скобках передавался тип*/
    @GetMapping("/hello-world")//при переходе по ссылке мы переходим в этот метод
    public String sayHello() {
        return "hello_world";
    }
    //метод возвращает строку - название страницы view которую вернет
    //каждый метод соответствует урлу
    //могут возвращать и джсон и другие структуры данных
}