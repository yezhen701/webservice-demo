package com.agioe.service;

import com.agioe.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by zhye on 2017/10/25.
 */
@WebService(name = "UserService", targetNamespace = "http://service.agioe.com/")
public interface UserService {
    @WebMethod
    String getName(@WebParam(name = "userId") String userId);
    @WebMethod
    List<User> getUserList();
}
