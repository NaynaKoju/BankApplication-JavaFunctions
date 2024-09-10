/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encapsulation;

/**
 *
 * @author dell
 */
public class Student {
    private String name;
    private double phnnum;
   
    public Student(){
       
    }
   
    public Student(String name, double phnnum){ //Uta method mai parameter haru pass garna
        setName(name);
        setphnnum(phnnum);
    }
   
    public void setName(String name){
        this.name=name;
    }
   
    public void setphnnum(double phnnum){
        this.phnnum=phnnum;
    }
   
    public String getName(){
        return name;
    }
    public double getphnnum(){
        return phnnum;
    }
}
