/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;
import com.mycompany.model.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class AccountHandler {
    static Scanner sc=new Scanner(System.in);
    //account ko array list banauna ko lagi
    ArrayList<Account> accounts=new ArrayList<>();
    DbConnection db=new DbConnection(); //Dbconnection ko object banako call garna lai db. garera
    
    public boolean addAccount(int accNo, String accName, int accBalance){
     if (findAccount(accNo)==null){
    String sql="INSERT INTO `bankdb`.`account` (`accountNumber`, `accountName`, `accountBalance`) VALUES ('"+accNo+"', '"+accName+"', '"+accBalance+"');";
    return db.iud(sql);
     }
     return false;
    }
  //acc no pailai dekhi xa ki xaina check garne,xa vane banauna nadini  
    //mathi ko acc ra eta ko acc same hainaa
    public Account findAccount(int accNo){
    //1 select statement chalauna lai sql 
    String sql="select * from bankdb.account where accountNumber="+accNo+";";
    ResultSet rs=db.select(sql); //select method call garyo. ayeko info rs vanne refrence variablema save gardinxa
    //kunai account vetyo vance rs vanne ma lyayera save garxa
    try{
        while(rs.next()){
            Account acc=new Account(rs.getInt(1), rs.getString(2),rs.getInt(3));
            //constructor call garera acc ma value load garya
            return acc;
        }
    } catch(SQLException e){
        return null;
    }
    return null;
    }
    public void checkBalance(int accountNumber){
        if (findAccount(accountNumber)!=null){
            Account acc=findAccount(accountNumber);
            System.out.println("Balance is" + acc.getAccountBalance());
        }
        else{
        System.out.println("Invalid account number");
    }}
    public boolean depositAmount(int accountNumber, int depositamount){
        if (findAccount(accountNumber)!=null){
            Account acc=findAccount(accountNumber); 
            acc.setAccountBalance(acc.getAccountBalance()+depositamount);
            String sql="UPDATE `bankdb`.`account` SET `accountBalance` = '"+acc.getAccountBalance()+"' WHERE (`accountNumber` = '"+acc.getAccountNumber()+"');";
        return db.iud(sql);
        }
        return false;
        
}
    public boolean withdrawAmount(int accountNumber, int withdrawAmount){
        if (findAccount(accountNumber)!=null){
        Account acc=findAccount(accountNumber);
        acc.setAccountBalance(acc.getAccountBalance()-withdrawAmount);
        String sql="UPDATE `bankdb`.`account` SET `accountBalance` = '"+acc.getAccountBalance()+"' WHERE (`accountNumber` = '"+acc.getAccountNumber()+"');";
        return db.iud(sql);
    }
    return false;
    }
    public boolean transferAmount(int senderAccNo, int recieverAccNo, int TransferAmount){
        if (findAccount(senderAccNo)!=null && findAccount(recieverAccNo)!=null)
        {
          Account acc1=findAccount(senderAccNo);
          Account acc2=findAccount(recieverAccNo);
          if(acc1.getAccountBalance()>TransferAmount){
           
          acc1.setAccountBalance(acc1.getAccountBalance()-TransferAmount);
          acc2.setAccountBalance(acc2.getAccountBalance()+TransferAmount);
            String sql1="UPDATE `bankdb`.`account` SET `accountBalance` = '"+acc1.getAccountBalance()+"' WHERE (`accountNumber` = '"+acc1.getAccountNumber()+"');";
            String sql2="UPDATE `bankdb`.`account` SET `accountBalance` = '"+acc2.getAccountBalance()+"' WHERE (`accountNumber` = '"+acc2.getAccountNumber()+"');";
            return db.iud(sql1)&& db.iud(sql2);
          }
        return false;
        }
        return false;
    }
    public boolean deleteAccount(int accountnumber){
        if(findAccount(accountnumber)!=null){
            Account acc=findAccount(accountnumber);
            String sql="DELETE FROM `bankdb`.`account` WHERE (`accountNumber` = '"+acc.getAccountNumber()+"');";
        return db.iud(sql);
        }
        else
            return false;
    }
    public ArrayList <Account> listAllAccount(){  
        String sql="select * from bankdb.account;";
        ResultSet rs=db.select(sql);
        accounts.clear();
        try{
            while(rs.next()){
                Account acc=new Account(rs.getInt(1),rs.getString(2),rs.getInt(3));
                accounts.add(acc);
            }
        }catch(SQLException e){
                    return null;
        }
        return accounts;
    }
}
        
    


 
