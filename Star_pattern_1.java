package com.company;

public class Star_pattern_1 {
    public static void main(String[] args) {
        /* Pattern number 1
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        System.out.println("Pattern number 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        /*
        Pattern number 2
        * * * * *
        * * * *
        * * *
        * *
        *
         */
        System.out.println("Pattern number 2 ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        /* Pattern number 3 is combination of pattern 1 and patten 2
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        System.out.println("Pattern number 3 is a combination of pattern 1 and 2 ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        /*
        Pattern number 4 which is same as Pattern 3 but difference is it is horizontal than 3
                      *
                     * *
                    * * *
                   * * * *
                  * * * * *
                 * * * * * *
         */

        System.out.println("Pattern number 4 which is same as Pattern 3 but difference is it is horizontal than 3");
        for (int i = 1; i <= 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");

            }
            System.out.println();
        }


        /*
        Pattern number 5
               *
             * *
           * * *
         * * * *
       * * * * *
     * * * * * *
              */
        System.out.println("Pattern number 5");
        for (int i = 1; i <= 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
  /*
  Pattern number 6
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
   */


        System.out.println("Pattern number 6");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }

        /*
        Pattern Number 7
               *
             * *
           * * *
         * * * *
       * * * * *
         * * * *
           * * *
             * *
               *

         */
        System.out.println("Pattern number 7");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        Star Pattern 8
                   *
                 * * *
               * * * * *
             * * * * * * *
         */
        System.out.println(" Star pattern 8");
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // we can also print the above code without useing three for loop
        System.out.println(" we can also print the above code without useing three for loop");
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
       /*
       Star pattern 9
        * * * * * * *
          * * * * *
            * * *
              *
      */

        System.out.println("Star pattern 9");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = 3; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        }

    }

