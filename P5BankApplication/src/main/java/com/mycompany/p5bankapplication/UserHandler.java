/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p5bankapplication;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class UserHandler {

    ArrayList<User> users = new ArrayList<>();

    public boolean login(String userName, String password) {
        for (User us : users) {
            if (us.getUsername().equals(userName) && us.getPassword().equals(password)) {
                return true;
            }
        }
         if(userName.equalsIgnoreCase("admin")&& password.equals("admin"))  {
             System.out.println("User created. CONGRATS!");
            return true; 
         }
         System.out.println("BOOO!Unsucessfull attempt!");
         return false;
        }
    public boolean adduser(String username, String password){
        if (findUser(username)==null){
            User us=new User(username,password);
            users.add(us);
            return true;
        }
        return false;
    }

    public User findUser(String username) {
        for (User us:users){
            if(us.getUsername().equalsIgnoreCase(username))
                return us;
        }
        return null;
    }
    public boolean deleteUser(String username){
        if (findUser (username)!=null){
            User us=findUser(username);
            users.remove(us);
            return true;
        }
        return false;
    }
    }


