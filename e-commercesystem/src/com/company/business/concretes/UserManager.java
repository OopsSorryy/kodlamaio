package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.core.abstracts.GoogleService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private List<String> emailList = new ArrayList<String>();
    private List<String> passwordList =new ArrayList<String>();

    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(UserDao userDao, GoogleService googleService) {
        this.userDao = userDao;
        this.googleService = googleService;
    }

    public static boolean valid(String email){
        String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(emailPattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    @Override
    public void register(User user) {
        if (user.getPassword().length()<6) {

            System.out.println("Password must be more than five... ");
            return;
        }
        if(user.getFirstName().length()<2 || user.getLastName().length()<2) {

            System.out.println("Name and surname fields must be greater than 2 characters.");

            return;}

        if( emailList.contains(user.getEmail())  ) {

            System.out.println("E-mail must not be used before");
            return;
        }

        else {
            emailList.add(user.getEmail());
            passwordList.add(user.getPassword());
            userDao.add(user);
            googleService.registerWithGoogleAccount("");

            System.out.println("You registered successfully...");
        }

    }

    @Override
    public void logIn(String email, String password) {
        if(emailList.contains(email) && passwordList.contains(password))
        {
            System.out.println("You logged in successfully");
            return;
        }

        else {
            System.out.println("Wrong email or password... Please check and try again");

        }
    }
}
