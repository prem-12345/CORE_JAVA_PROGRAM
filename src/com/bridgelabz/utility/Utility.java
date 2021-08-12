package com.bridgelabz.utility;


public class Utility {


    //Flip coin and print percentage of Heads and Tails

    public void CoinFlip(int totalFlip) {

        //variables
        int count = 0;
        int head = 0;
        int tail = 0;

        //computation
        while (count != totalFlip) {
            double flip = Math.random();
            System.out.println(flip);

            if (flip < 0.5) {
                System.out.println("Print Head");
                head++;

            } else {
                System.out.println("Print Tail");
                tail++;
            }
            count++;
        }

        System.out.println("number of heads wins: " + head);
        System.out.println("numberof tails wins:" + tail);

        int perHaid = (head * 100 / totalFlip);
        int perTail = (tail * 100 / totalFlip);
        System.out.println("the percentage of head win:" + perHaid);
        System.out.println("the percentage of tail win:" + perTail);


    }

    //to get the status of Leap Year

    public void Leapyear(int YearToCheck) {

        boolean leapValue = false;

        if (((YearToCheck % 4 == 0) && (YearToCheck % 100 != 0)) || (YearToCheck % 400 == 0)){
            leapValue=true;}

        if (leapValue)
            System.out.println(YearToCheck + " is a leap year.");
        else
            System.out.println(YearToCheck + " is not a leap year.");
    }

    //to get the power of 2

    public void GetPowerOfTwo(int powerOfTwo) {
        if (powerOfTwo <= 0 || powerOfTwo < 31) {
            System.out.println("Power of 2's: ");

            for (int i = 0; i <= powerOfTwo; i++) {
                int powerOfValue = ((int) Math.pow(2, i));      //2^i
                System.out.println("The value of 2^" + i + " is: " + powerOfValue);
            }
        } else
            System.out.println("Value overflows int value");
    }

        //Prime Factorization of number

    public void PrimeFacor(int numberToFactorize) {

        System.out.println("Prime factors of " + numberToFactorize + " are ::");

        for (int i = 2; i < numberToFactorize; i++) {

            while (numberToFactorize % i == 0) {
                System.out.println(i + " ");
                numberToFactorize = numberToFactorize / i;

            }
        }
        if (numberToFactorize > 2) {
            System.out.println(numberToFactorize);
        }
    }

}












