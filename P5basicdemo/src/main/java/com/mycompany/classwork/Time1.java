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
public class Time1 {
  private int hour;
  private int min;
  private int sec;
 
    public Time1(){
       setHour(0);
       setMin(0);
       setSec(0);
    }
       public Time1(int hour){
       setHour(hour);
       setMin(0);
       setSec(0);
}
   
    public Time1(int hour, int min){
        setHour(hour);
       setMin(min);
       setSec(0);
    }
    public Time1(int hour,int min, int sec){
        setHour(hour);
        setMin(min);
        setSec(sec);
    }
     public void setHour(int hour){
        this.hour=hour;
    }
   
    public void setMin(int min){
        this.min=min;
    }
     public void setSec(int sec){
        this.sec=sec;
    }
   
    public int getHour(){
        return ((hour>0 && hour<24) ? hour : 0);
    }
    public int getMin(){
        return ((min>0 && min<60) ? min :0);
    }
    public int getSec(){
        return ((sec>0 && sec<60) ? sec: 0);
    }
}
  

