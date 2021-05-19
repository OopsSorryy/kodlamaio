package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    private List<User> users = new ArrayList<User>();

    public HibernateUserDao(List<User> users) {
        this.users = users;
    }

    public HibernateUserDao() {

    }

    @Override
    public void add(User user) {
        System.out.println("User added with hibernate " + user.getFirstName());

    }

    @Override
    public void update(User user) {
        System.out.println("User updated with hibernate " + user.getId());

    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted with hibernate " + user.getFirstName());

    }

    @Override
    public User get(int id) {
       return this.get(id);
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
