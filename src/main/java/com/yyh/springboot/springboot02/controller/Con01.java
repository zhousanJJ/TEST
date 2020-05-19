package com.yyh.springboot.springboot02.controller;

import com.yyh.springboot.springboot02.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Con01 {

    @Autowired
    Person person;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        String count = request.getParameter("count");
        String passwd = request.getParameter("passwd");
        System.out.println(count);
        if(count.equals("yyh") && passwd.equals("123")) return "hello "+count;
        return "Wrong count";
    }

    @ResponseBody
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public Person hello1(HttpServletRequest request){
        String count = request.getParameter("count");
        String passwd = request.getParameter("passwd");
        System.out.println(count);
//        if(count.equals("yyh") && passwd.equals("123")) return person;
        return person;
    }
}
