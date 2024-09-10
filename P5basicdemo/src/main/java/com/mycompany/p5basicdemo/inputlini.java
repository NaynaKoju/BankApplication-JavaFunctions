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
public class inputlini {
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter First number");
 int x= sc.nextInt();
 System.out.println("Enter Second number");
 double y= sc.nextDouble();
 double sum=x+y;
 System.out.println("Sum is" + sum);
}
}