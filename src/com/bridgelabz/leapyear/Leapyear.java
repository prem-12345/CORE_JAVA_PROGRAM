package com.bridgelabz.leapyear;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year you want to check:");
        int YearToCheck=sc.nextInt();

        Utility utility=new Utility();
        utility.Leapyear(YearToCheck);


    }
}
