package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.UserManager;
import com.company.core.concretes.GoogleManagerAdapter;
import com.company.dataAccess.abstracts.UserDao;
import com.company.dataAccess.concretes.HibernateUserDao;
import com.company.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter() {
        });

        User user = new User(1,"YunusEmre","OZCAN","yunusemre123@gmail.com","123456789");
        userService.register(user);

        userService.logIn("yunusemre123@gmail.com","123456789");

    }
}
