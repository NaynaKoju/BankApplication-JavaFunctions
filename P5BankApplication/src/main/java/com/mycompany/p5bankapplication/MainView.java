/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p5bankapplication;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class MainView {
   static Scanner sc=new Scanner(System.in);
   static AccountHandler ah= new AccountHandler(); ///instance variable ko rup ma
   static UserHandler uh=new UserHandler();
    public static void main(String[] args) {
        boolean exit=false;
        do{
      if (loginView()){
        int ch;
        do{
       System.out.println("Welcome");
       System.out.println("********");
       ///option diyera choose garya option anusar kamm hune garna lai
       System.out.println("1) Add Account");
       System.out.println("2) Check Balance");
       System.out.println("3) Deposit amount");
       System.out.println("4) Withdraw amount");
       System.out.println("5) Transfer amount");
       System.out.println("6) Delete account");
       System.out.println("7) List account");
       System.out.println("8)  Add user");
       System.out.println("9) Delete user");
       
       System.out.println("*******");
       ch=sc.nextInt();
       switch(ch){
           case 0:
               break;
           case 1:
               addAccountView();
               break;
           case 2:
             checkBalanceView();
               break;
           case 3:
               depositAmountView();
               break;
           case 4:
               withdrawAmountView();
               break;
           case 5:
               transferAmountView();
               break;
           case 6:
               deleteAccountView();
               break;
           case 7:
               listAccountView();
               break;
           case 8:
               adduserView();
               break;
           case 9:
               deleteuserView();
               break;
               
           default:
               System.out.println("Enter appropriate choice");
       }
        } while (ch!=0);
       
    }
    System.out.println("Enter 1 to relogin and 0 to exit");
    int p=sc.nextInt();
    if(p!=1){
    exit=true;
} 
        }while(!exit);
}     
 public static void addAccountView(){
     System.out.println("Enter account name");
     String accName=sc.next();
     System.out.println("Enter new account number");
     int accountnumber=sc.nextInt();
     System.out.println("Enter opening balance");
     int accountBalance=sc.nextInt();
     //accounthandler lai invoke garnu xa vane
    if (ah.addAccount(accountnumber, accName, accountBalance)){ //acc handler ko boolean vitra pathako
 System.out.println("Accounnt created sucessfully");
 }
 else{
    System.out.println("Account already exixts");
}
    }
    public static void checkBalanceView() {
        System.out.println("Enter account number");
        int accountNumber=sc.nextInt();
        ah.checkBalance(accountNumber);
    }
    public static void depositAmountView(){
        System.out.println("Enter the  account number");
        int accountNumber=sc.nextInt();
        ah.depositAmount(accountNumber);
    }
    public static void withdrawAmountView(){
        System.out.println("Enter account number");
        int accountNumber=sc.nextInt();
        System.out.println("Enter withdraw balance");
        int withdrawAmount=sc.nextInt();
        int status=ah.withdrawAmount(accountNumber,withdrawAmount);
        if (status==1){
        System.out.println("Withdraw sucessful");     
            
        }
        else if(status==-1){
             System.out.println("Insufficient Balance");
            
        }
        else{
             System.out.println("Invalid account");
        }
    }
    public static void transferAmountView(){
        System.out.println("Enter sender account number");
        int senderaccountNumber=sc.nextInt();
        System.out.println("Enter account number of reciever");
        int recieveraccountNumber=sc.nextInt();
        System.out.println("Enter the amount to transfer");
        int transferAmount=sc.nextInt();
        int status=ah.transferAmount(senderaccountNumber, recieveraccountNumber, transferAmount);
        if (status==1){
        System.out.println("transfer sucessful");     
            
        }
        else if(status==-1){
             System.out.println("Insufficient Balance");
            
        }
        else{
             System.out.println("Invalid account");
        }   
    }
    public static void deleteAccountView(){
        System.out.println("Enter account number");
        int accountnumber=sc.nextInt();
        if (ah.deleteAccount(accountnumber)){
            System.out.println("Account deleted sucessfully");
        }
        else
            System.out.println("This account doesnot exist");   
    }
    public static void listAccountView(){
        for (Account acc:ah.listAllAccount()){
        System.out.println(acc.getAccountNumber()+" "+ acc.getAccountName()+" "+ acc.getAccountBalance());
        }
        
    }
    
    public static boolean loginView(){
        
        System.out.println("Enter username");
        String userName=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        return uh.login(userName, password);   
        }  
    public static void adduserView(){
        System.out.println("Enter username");
        String username=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        System.out.println("Please enter password again");
        String temp=sc.next();
        if(password.equalsIgnoreCase(temp))
            if(uh.adduser(username, password)){
                System.out.println("User added sucessfully");
            }
            else{
                System.out.println("Username already exists");
            }
    }
    public static void deleteuserView(){
        System.out.println("Login again to delete user");
        if(loginView()){
            System.out.println("Enter username you want to delete");
            String username=sc.next();
            if (uh.deleteUser(username)){
                System.out.println("User deleted!OOOOPPPPSSS");
            }
            else{
                System.out.println("User doesnot exists!YOU LIED");
            }
        }
    }
    }
    
        
