package com.company;
import java.util.Scanner;


public class java_factorial {
    public static void main(String[] args) {

        // factorail means factorial of 4 = 4* 3* 2* 1


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial : ");
        int n = sc.nextInt();
        int f=1;

        for (int i =1; i<=n; i++){   // factorial of 4 is 1*1*2*3*4
            f *=i;
        }
        System.out.println("factorial of your number is :" + f);

    }
}
