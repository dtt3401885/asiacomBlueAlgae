package com.asiacomBigData.boot.controller;
import com.alibaba.fastjson.JSONArray;
import com.asiacomBigData.boot.model.User;
import com.asiacomBigData.boot.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        if(user!=null){
            logger.info(JSONArray.toJSON(user));
        }
        return user;
    }
}