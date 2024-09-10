/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class UserHandler {

    ArrayList<User> users = new ArrayList<>();
    DbConnection db=new DbConnection();
    public boolean login(String userName, String password) {
     String sql="select * from bankdb.user;";   
     ResultSet rs=db.select(sql);
     try{
         while(rs.next()){
             User us=new User(rs.getString(1),rs.getString(2));
             if (us.getUsername().equals(userName) && us.getPassword().equals(password)) {
                return true;
         }
     }   
        }
     catch(SQLException e){
         return false;
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
            String sql="INSERT INTO `bankdb`.`user` (`userName`, `password`) VALUES ('"+username+"', '"+password+"');";
        return db.iud(sql);
        }
        return false;
    }

    public User findUser(String username) {
        String sql="select * from bankdb.user where userName=\""+username+"\";";
        ResultSet rs=db.select(sql);
        try{
         while(rs.next()){
             User us=new User(rs.getString(1),rs.getString(2));
             return us;
         }
     }   
     catch(SQLException e){
    System.out.println("Database Error");
    }
         return null;
    }
    public boolean deleteUser(String username){
        if (findUser (username)!=null){
            User us=findUser(username);
            String sql="DELETE FROM `bankdb`.`user` WHERE (`userName` = '"+us.getUsername()+"');";
           return db.iud(sql);
        }
        else
            return false;
    }
    }


