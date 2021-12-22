package com.company;
import java.util.Scanner;

/*
Get the number from user
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print palindrome number
Else print not palindrome number
 */

public class palindromic_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for palindrom check :");
        int num = sc.nextInt();
        int number = num;
        if (number ==0){
            System.out.println(" Palindrom number");
        }else {
            System.out.println("wait checking...");
        }
        int rem,rev=0;
        while (number !=0){
                rem = number%10;
                rev = rev * 10 + rem;
                number = number /10;
        }
        System.out.println(rev);

        // checking if palindrom
        if (rev == num){
            System.out.println(" Palindrom number");
        }else {
            System.out.println("not a palindrom number");
        }
    }
}
