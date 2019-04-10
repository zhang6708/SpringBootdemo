package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("springboot")
public class Controller {

    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    public String hello(@PathVariable("name")String name){
        return "hello"+name;
    }

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/list")
    //测试
    //ce
    public List<User> listAll() {
        return userServiceImpl.listAll();
    }


}
