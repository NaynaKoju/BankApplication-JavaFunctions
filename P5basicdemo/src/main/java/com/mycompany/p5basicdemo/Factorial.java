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
public class Factorial {
    public static void main(String[] args){
        int i =1;
        long fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        /*
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
         System.out.println("Fact of number is"+fact);/*
        
        */
        /*while (i<=number){
          fact=fact*i;
          i++;
        }
        System.out.println("Fact of number is"+fact);*/
        do{
            fact=fact*i;
            i++;
        }
        while (i<=number);
        System.out.println("Fact of number is"+ " "+fact);
        
    }
  }
