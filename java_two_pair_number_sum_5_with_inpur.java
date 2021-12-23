package com.company;
import java.util.Scanner;

/*
i have to take a pair of num whose sum is 5
 */


public class sum_two_pair_number {


    public static void main(String[] args) {

        //taking user inpur
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to check :");
        int n = sc.nextInt();
        int [] ar = new int[n];
        System.out.println("Enter the numbers :");
        for (int i =0; i<n ; i++){
            ar[i] = sc.nextInt();
            System.out.println(ar[i]);
        }


       // int num [] = {2,6,-7,3,4,1,-1,-2,8};
       for (int i=0 ; i<ar.length;i++){
           for (int j=1; j<ar.length;j++){
               if (ar[i] + ar[j] ==5){
                   System.out.println(ar[i] + "+" + ar[j] + "=" + "5");
               }
           }
       }



    }
}
