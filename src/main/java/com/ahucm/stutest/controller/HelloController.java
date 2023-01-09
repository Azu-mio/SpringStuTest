package com.ahucm.stutest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//http://www.baidu.com/s/xx
//http://localhost:8080/hello
//http://localhost:8080/hello?nickname=zhangsan  #用户传过来一个张三的数据
    @RequestMapping ("/hello")
    //eg  RequestMapping('/hello",method = RequestMethod.GET) #这里只能接受get请求
    //@GetMapping是RequestMapping()的简写 这里并未指定是什么请求  用GetMapping更方便写
    public  String hello(String nickname,String phone){
        System.out.println(phone);
        return "hello world哈罗你好" + nickname;
    }
}
