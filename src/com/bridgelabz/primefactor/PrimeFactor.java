package com.bridgelabz.primefactor;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ::");
        int numberToFactorize= sc.nextInt();

        Utility utility=new Utility();
        utility.PrimeFacor(numberToFactorize);

    }
    }

