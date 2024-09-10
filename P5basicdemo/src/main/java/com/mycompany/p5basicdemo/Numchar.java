/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p5basicdemo;

/**
 *
 * @author dell
 */
/*program to take two number and one character from user and 
do the following operation according to the character. 'a'>Addition 
's'> subtraction 'p'>product and 'd'> division using switch statement.*/
import java.util.Scanner;
public class Numchar {
    public static void main(String[] args){
        char operator;
        Double number1, number2;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        
        System.out.println("Choose a for addition");
        double add=num1+num2;
        System.out.println("Choose s for subtraction");
        double sub=num1-num2;
        System.out.println("Choose d for division");
        int div=num1/num2;
        System.out.println("Choose p for multiplication");
        int prod=num1*num2;
        int choosen=sc.nextInt();
        
        switch (choosen){
            case 1:
                System.out.println("the answer is"+add);
                break;
             case 2:
                System.out.println("the answer is"+sub);
                break;
             case 3:
                System.out.println("the answer is"+div);
                break;
             case 4:
                System.out.println("the answer is"+prod);
                break;
             default:
                 System.out.println("Invalid operator");
        
        
    }    
  } 
}
