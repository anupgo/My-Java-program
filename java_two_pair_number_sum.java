package com.company;

/*
i have to take a pair of num whose sum is 5
 */


public class sum_two_pair_number {


    public static void main(String[] args) {
        int num [] = {2,6,-7,3,4,1,-1,-2,8};
       for (int i=0 ; i<num.length;i++){
           for (int j=1; j<num.length;j++){
               if (num[i] + num[j] ==5){
                   System.out.println(num[i] + "+" + num[j] + "==" + "5");
               }
           }
       }



    }
}
