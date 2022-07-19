package ru.veselov.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;//not used
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};//тут будет замена аппликейшн контекст
    }//конфигурация

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//все запросы пойдут на диспетчер сервлет
    }//url pattern в xml
}
