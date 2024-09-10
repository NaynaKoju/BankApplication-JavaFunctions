/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author dell
 */
public class User {
    private String Username;
    private String password;

    public User() {
    }

    public User(String Username,String password) {
        this.Username = Username;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }
    
}
