package com.example.tacocloud.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * addViewControllers方法会接受一个ViewControllerRegistry对象，
     * 可以使用它注册一个或多个视图控制器。
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*
         * 这里调用registry的addViewController将"/"传递了进去，
         * 视图控制器将会针对该路径执行GET请求。
         * 这个方法会返回ViewControllerRegistration对象，
         * 基于该对象调用setViewName方法，用它指明当请求 "/" 的时候要转发到home视图上
         */
        registry.addViewController("/").setViewName("home");
    }
}
