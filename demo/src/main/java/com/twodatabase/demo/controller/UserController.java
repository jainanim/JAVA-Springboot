package com.twodatabase.demo.controller;

import java.util.List;

import com.twodatabase.demo.model.User;
import com.twodatabase.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = { "/user"})
    public List<User> getAllUsers(){

        List<User> usersList = userService.getAllUser();

        return usersList;
    }



}
