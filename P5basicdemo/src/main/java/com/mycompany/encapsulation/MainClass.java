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
public class MainClass {
    public static void main(String[] args) {
     Student s1=new Student(); //ya error aauxa kinaki uta hamle constructor banako xaina so uta student class ma constructor banaunu parxa
   //s1.name="Johnsena"; access garna mildaina rw name ma error aauxa
     s1.setName("Johnsena");
     s1.setphnnum(9336373);
     System.out.println("Name :"+ s1.getName());
     System.out.println("Phone num :"+ s1.getphnnum());
     
     Student s2=new Student("Johnsena",9336373);  //constructor banaunu parxa yasto garna
      System.out.println("Name :"+ s2.getName());
     System.out.println("Phone num :"+ s2.getphnnum());
    }

}
