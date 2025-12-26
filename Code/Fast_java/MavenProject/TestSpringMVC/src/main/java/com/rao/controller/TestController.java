package com.rao.controller;

import com.rao.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    //访问路径http://localhost:8887/test1
    @RequestMapping("/test1")
    public String test1(){
        return "index.jsp";
    }

    //访问路径http://localhost:8887/testspringmvc/testParam?name=marry&age=18
    //url中的name和age变量要和方法中的参数名对应
    @RequestMapping("/testParam")
    public String testParam(String name,int age){
        System.out.println(name + "----" + age);
        return "index.jsp";
    }

    //访问路径http://localhost:8887/testspringmvc/testParam?name=marry&age=18
    //url中的name和age变量要和Person类中的变量名对应
    @RequestMapping("/testParam23") //这里面的路径"/testParam23"随便写，不要求和方法名一样
    public String testParam2(Person p){
        System.out.println(p.getName() + "----" + p.getAge());
        return "index.jsp";
    }
}
