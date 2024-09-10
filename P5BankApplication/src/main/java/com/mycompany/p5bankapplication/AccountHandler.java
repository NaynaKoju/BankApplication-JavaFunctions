/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p5bankapplication;
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
    
    public boolean addAccount(int accNo, String accName, int accBalance){
     if (findAccount(accNo)==null){
         Account acc=new Account (accNo,accName,accBalance);
    accounts.add(acc);
    return true;
     }
     return false;
    }
  //acc no pailai dekhi xa ki xaina check garne,xa vane banauna nadini  
    //mathi ko acc ra eta ko acc same hainaa
    public Account findAccount(int accNo){
      //account vanne arraylist ma loop lagaune, tya account no. xa vane tei return garne xaina vane null
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
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
    public void depositAmount(int accountNumber){
        if (findAccount(accountNumber)!=null){
            Account acc=findAccount(accountNumber); 
            System.out.println("Enter deposit amount");
            int depositAmount=sc.nextInt();
            acc.setAccountBalance(acc.getAccountBalance()+ depositAmount);
            System.out.println("paisa halna sakyo ghar jaau");
    }
        else{
        System.out.println("Invalid account number");
    }
        
}
    public int withdrawAmount(int accountNumber, int withdrawAmount){
        if (findAccount(accountNumber)!=null){
        Account acc=findAccount(accountNumber);
        if(acc.getAccountBalance()>withdrawAmount){
            acc.setAccountBalance(acc.getAccountBalance()-withdrawAmount);
            return 1;
        }
        else{
            return -1;
        }
        }
          return 0;
    }
    public int transferAmount(int senderAccNo, int recieverAccNo, int TransferAmount){
        if (findAccount(senderAccNo)!=null && findAccount(recieverAccNo)!=null)
        {
          Account acc1=findAccount(senderAccNo);
          Account acc2=findAccount(recieverAccNo);
          if(acc1.getAccountBalance()>TransferAmount){
            acc1.setAccountBalance(acc1.getAccountBalance()-TransferAmount);
            acc2.setAccountBalance(acc2.getAccountBalance()+TransferAmount);
            return 1;
        }
        else{
            return -1;
        }
        }
          return 0;
        }
    public boolean deleteAccount(int accountnumber){
        if(findAccount(accountnumber)!=null){
            Account acc=findAccount(accountnumber);
            accounts.remove(acc);
            return true;
        }
        else
            return false;
    }
    public ArrayList <Account> listAllAccount(){   
        return accounts;
    }
}
        
    


 
