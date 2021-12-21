package com.company;

/*
what i will do
i will print account holder name accouunt number available balance
next i wll make a withdrawal method
next I will make a deposit method

 */
class Account{


    int acc_no ;
    String name;
    int bal;

    void details(){
        name = "Raj kumar";
        acc_no= 4785246;
        bal = 4000;
        System.out.println(name + " your account number is :" + acc_no +" and total bal. :  " + bal);
    }
    void deposit(int amt){
        bal += amt;
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
	Account a = new Account();
    a.details();
    a.deposit(4000);
    a.withdrawal(1000);
    a.check();


    }
}
