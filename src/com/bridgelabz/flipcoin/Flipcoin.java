package com.bridgelabz.flipcoin;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {


        //taking input totalFlip for the number of times coin flip
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin flip");
        int totalFlip = sc.nextInt();

        Utility utility = new Utility();
        utility.CoinFlip(totalFlip);
    }

}
