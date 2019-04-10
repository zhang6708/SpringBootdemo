package com.example.demo.service.impl;

import com.example.demo.dao.User;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserService Service;

    public List<User> listAll() {
        return Service.listAll();
    }
}
