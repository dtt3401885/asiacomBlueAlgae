package com.asiacomBigData.boot.controller;

import com.asiacomBigData.boot.model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setId((long)Math.floor(Math.random()*52000 + 1));
        user.setName("test");
        user.setAge(33);
        user.setPassword("12345");
        return user;
    }
}