/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop;

/**
 *
 * @author dell
 */
public class Mainclass {
  public static void main(String[] args){
      Student s1=new Student(2,"Aman",'M'); //s1 type ko new reference varaiable
     /* s1.roll=2;
      s1.name="Anusha";
      s1.gender='F';
      s1.height="Tall";*/
      System.out.println(s1.roll);
      System.out.println(s1.name);
      System.out.println(s1.gender);
      // System.out.println(s1.height);
       System.out.println("*********");
     
      s1.updateName("Bibek");
      System.out.println(s1.name);
      System.out.println("*********");
     
      Student s2=new Student();
      s2.roll=3;
      s2.name="Kishor";
      s2.gender='M';
     // s2.height="Tall";
      System.out.println(s2.roll);
      System.out.println(s2.name);
      System.out.println(s2.gender);
     //  System.out.println(s2.height);
       System.out.println("*********");
       
       s2.updateName("Aayam");
      System.out.println(s2.name);
      System.out.println("*********");
      System.out.println("Update Count   :"+ s2.count);
       System.out.println("*********");
      //Students s3=new Students();
     
     // s3.name="Basanti";
     // s3=s2;
      //System.out.println(s3.name);
      //s3=null;
     
     
      Student s3=new Student(5,"Biplav");
      System.out.println(s3.roll);
      System.out.println(s3.name);
      System.out.println(s3.gender);
      System.out.println("*********");

  }  
}

