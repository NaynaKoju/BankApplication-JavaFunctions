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
public class ArrayDemo {
    public static void main(String[] args) {
        //int[] marks={76,66,78,74};
        
       // int[] marks=new int[] {77,76,78,75};
        
  int[] marks=new int[4];                     //declaration
  marks[0]=76;                               //array indexing
  marks[1]=88;
  marks[2]=56;
  marks[3]=77;
  System.out.println("first term marks:" + marks[0]);
  System.out.println("the number of exams:" + marks.length);
  
  for (int i=0;i<marks.length;i++){
      System.out.println(marks[i]);
  }
marks[2]=86;
System.out.println("Updated mark for mark[2] is"+ marks[2]);
int totalMarks=0;
for(int x:marks){
   // System.out.println(x);
   totalMarks+=x; //totalMarks=totalMarks+x
}
double percentage=totalMarks/4;
System.out.println("Percentage="+percentage);

    }
}
