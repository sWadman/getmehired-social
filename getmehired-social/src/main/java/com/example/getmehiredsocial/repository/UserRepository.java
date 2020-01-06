package com.example.getmehiredsocial.repository;

import com.example.getmehiredsocial.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {

        User user = new User("Shaun", 27, "608 9 ST", "Calgary", "Canada", "5874292429");
        return user;
    }
}
