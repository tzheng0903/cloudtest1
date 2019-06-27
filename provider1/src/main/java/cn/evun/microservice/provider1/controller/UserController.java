package cn.evun.microservice.provider1.controller;

import cn.evun.microservice.provider1.model.User;
import cn.evun.microservice.provider1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User get(@PathVariable("id") Integer id){
        return userService.get(id);
    }
}
