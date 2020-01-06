package com.example.getmehiredsocial.service;

import com.example.getmehiredsocial.model.User;
import com.example.getmehiredsocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }

}
