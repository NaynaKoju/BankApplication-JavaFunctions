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
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> series= new ArrayList<>();
        series.add("Nayna");
        series.add("Esha");
        series.add("Puja");
        series.add("Shristi");
        System.out.println(series.get(2));
        series.set(2,"Timalsina");
        series.remove(3);
        
        for(String x:series){
            System.out.println(x +" " + "is a good girl");
        }
    }
}
