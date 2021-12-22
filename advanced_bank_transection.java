package com.company;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/*
what i will do
i will print account holder name account number available balance
next i wll make a withdrawal method
next I will make a deposit method
This code will generate random account number
this code has default account balance 10000 

 */
 class Account{


    long acc_no ;
    String name;
    int bal =10000;

    Random random=new Random();
    void details(){

        name = "Raj kumar";
        acc_no= (long) random.nextLong();
        bal = 10000;
        System.out.println(name + " your account number is :" + acc_no +" and total bal. :  " + bal);
    }
    void deposit(int amt){
        bal = 10000+ amt;
        System.out.println(amt + " Deposited in your account and total bal is : " + bal);
    }
    void withdrawal(int amt){
        if(amt>bal){
            System.out.println("Insufficient balance ");
        } else {
            bal -=amt;
            System.out.println(amt + " withdrawal");
            System.out.println("Available bal is :" +bal);
        }

    }
    void check(){
        System.out.println("you total balance is  " + bal  );
        System.out.println("Your account number is "+ acc_no);
    }


}

public class Main {



    public static void main(String[] args) {

        System.out.println(" Your default account balance is 10000");
        int k = 10000;
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre 1 for details 2 for deposit and 3 for withdrawal");

        //TAKING INPUT
        int s = sc.nextInt();
        if (s ==1){
            a.details();
        }else if (s==2){
            System.out.println("Enter amount to deposit :");
            int am = sc.nextInt();
            a.deposit(am);
        }else if (s==3){
            System.out.println("Enter amount for withdrawal : ");
            int wd =sc.nextInt();
            if (wd>k){
                System.out.println("Insufficient balance");
            }else if (wd<=k){
                System.out.println("Processing wait ! ");
                a.withdrawal(wd);
            }else {
                System.out.println("ERROR......");
            }
        } else {
            System.out.println("INVALID NUMBER");
        }

        System.out.println("Do you want to check you balance enter Y for yes and N for no");
        String ck = sc.next();
        if (Objects.equals(ck, "Y")){
            System.out.println("wait processing...");
            a.check();
        }else if (Objects.equals(ck, "N")){
            System.out.println("Thank You GOOD DAY");
        }else {
            System.out.println("INVALID");
        }


    }
}
