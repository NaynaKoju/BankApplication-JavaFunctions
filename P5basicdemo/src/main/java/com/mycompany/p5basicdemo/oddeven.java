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
public class oddeven {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    if (num%2==0)
    System.out.println(num+ "Damn its even");
    else
    System.out.println(num+ "Oops its odd");
}
}
