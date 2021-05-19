package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface UserService {
    void register(User user);
    void logIn(String email, String password);

}
