package com.twodatabase.demo.service;

import com.twodatabase.demo.Dao.UserDaoImpl;
import com.twodatabase.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDao;

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
