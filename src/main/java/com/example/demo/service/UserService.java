package com.example.demo.service;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface UserService {

    public List<User> listAll();
}
