package com.example.demo.service.impl;

import com.example.demo.dao.User;

import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    protected Userservice services;

    public List<User> listAll() {
        return services.selectAll();
    }
}
