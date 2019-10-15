package com.example.demo4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("/index")
    public String index(){
        return "bar/index";
    }
    @RequestMapping("/index1")
    public String index1(){
        return "bar/index1";
    }
    @RequestMapping("/index2")
    public String index2(){
        return "bar/index2";
    }
    @RequestMapping("/manager")
    public String manager(){
        return "bar/manager";
    }
    @RequestMapping("/perject")
    public String perject(){
        return "bar/perject";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/main2")
    public String main2(){
        return "main2";
    }
}
