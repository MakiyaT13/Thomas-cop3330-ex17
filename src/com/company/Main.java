/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        int gender = input.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = input.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int pounds = input.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hours = input.nextInt();

        double BAC;

        if(gender == 1){
            BAC = (ounces * 5.14 / pounds * 0.73) - .015 * hours;
        }
        else{
            BAC = (ounces * 5.14 / pounds * 0.66 ) - .015 * hours;
        }

        System.out.printf("Your BAC is %.6f\n", BAC);

        if (BAC > 0.08){
            System.out.print("It is legal for you to drive.");
        }
        else {
            System.out.print("It is not legal for you to drive.");
        }

    }
}
