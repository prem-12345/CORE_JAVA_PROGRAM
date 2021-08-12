package com.bridgelabz.poweroftwo;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N:");
        int powerOfTwo = sc.nextInt();

        Utility utility=new Utility();
        utility.GetPowerOfTwo(powerOfTwo);


    }
}
