/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author dell
 */
public class MainClass {
    public static void main(String[] args) {
        Food f=new Food(); ///food ko instance class F vanne banako
        f.eat();          ///method invokation
        Pizza p=new Pizza(); ///pizza ko instance 
        p.eat();
        System.out.println("Pizza price:"+ p.price);
        Sizzler s=new Sizzler();
        s.eat();
        //System.out.println("Sizzler price:"+ s.price);
        Burger b=new Burger();
        b.eat();
        System.out.println("Burger price:"+ b.price);
        
    }
}
