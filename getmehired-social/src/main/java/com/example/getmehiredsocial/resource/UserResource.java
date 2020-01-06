package com.example.getmehiredsocial.resource;

import com.example.getmehiredsocial.model.User;
import com.example.getmehiredsocial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public User getUser() {
        return userService.getUser();
    }
}
