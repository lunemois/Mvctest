package com.example.Mvctest.service;

import com.example.Mvctest.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    public String login(User user) {
        // create user
        List<User> userList = createdUser();

        // valid user
        boolean checked = validUser(user, userList);

        // exist user
        if (checked) {
            return user.getName();
        }

        // no user
        return "EmptyData";
    }

    private List<User> createdUser() {
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setName("배영혜");
        user1.setAge("22");

        User user2 = new User();
        user2.setName("조인희");
        user2.setAge("28");

        userList.add(user1);
        userList.add(user2);

        return userList;
    }

    private boolean validUser(User user, List<User> userList) {
        return userList.contains(user);
    }
}
