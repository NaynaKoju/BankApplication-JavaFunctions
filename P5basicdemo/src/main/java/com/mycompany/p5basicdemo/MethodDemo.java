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
import java.util.Scanner;
public class MethodDemo {
 public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter first number");
     int a= sc.nextInt();
     System.out.println("Enter second number");
     int b= sc.nextInt();
     System.out.println("Enter third number");
     int c= sc.nextInt();
     double result=sum(a,b,c);
     System.out.println("Result is" + " "+ result);
     double avg=average (a,b,c);
      System.out.println("Average is" + " "+ avg);
 }
    public static double sum(int a, int b, int c){
     double s= a+ b + c;
     return s;   
    }
   public static double average(int a, int b, int c){
       double avg= (a+b+c)/3;
       return avg;
    }
    }

