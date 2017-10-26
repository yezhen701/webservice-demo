package com.agioe.service.impl;

import com.agioe.dao.UserDAO;
import com.agioe.entity.User;
import com.agioe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by zhye on 2017/10/25.
 */
@WebService(targetNamespace="http://service.agioe.com/",endpointInterface = "com.agioe.service.UserService")
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public String getName(String userId) {
        User info = userDAO.findOne(userId);
        return info.getUserName();
    }

    @Override
    public List<User> getUserList() {
        List<User> list =  userDAO.findAll();
        return list;
    }
}
