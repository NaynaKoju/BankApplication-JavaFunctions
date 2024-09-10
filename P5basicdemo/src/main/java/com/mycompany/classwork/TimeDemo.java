/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classwork;

/**
 *
 * @author dell
 */
public class TimeDemo {
     public static void main(String[] args) {
            Time1 t1=new Time1(9);
            Time1 t2=new Time1(4, 20);
            Time1 t3=new Time1(2, 9, 30);
            Time1 t4= new Time1(29,90, -30);
           
            display(t1);
            display(t2);
            display(t3);
            display(t4);
           
    }
    public static void display(Time1 t){
        System.out.printf("%02d : %02d : %02d \n" ,t.getHour(),t.getMin(),t.getSec());
    }
}
