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
public class Student {
    //int roll=1;
    //String name="Bibek";
    //char gender='M';
    //String height="Tall";
    static int count=0;
    //Constructorko lagi
   
    int roll;
    String name;  //instance variables
    char gender;
   
     public Student(){
      this(0, null,'N');
    }
   
   
    public Student(String newName){
     roll=0;//roll=2;
     name=null;// name="Anusha";  
     gender='N';   //gender='F';  
    }
   
   
   public Student(int newRoll){ //yasto ni garna sakxa overloading ma
          this(newRoll, null, 'N'); //roll=newRoll;
    }
   
    public Student(int newRoll, String newName){
        this(newRoll, newName, 'N');// roll=newRoll;
       // name=newName;
    }
   public Student(int Roll, String Name, char Gender){ // farak pardaina kinaki local scope ho local varaible ko
       this.roll=Roll;
       this.name=Name;
       this.gender=Gender;
    }
   
    public void updateName(String newName){
        name=newName;
        count++;
    }
}

