package com.study.cloud.controller;

import com.study.cloud.feign.UserFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserFeign userFeign;

    public UserController(UserFeign userFeign) {
        this.userFeign = userFeign;
    }

    @GetMapping(value = {"", "/"})
    public String list() {
        return userFeign.userList();
    }

}
