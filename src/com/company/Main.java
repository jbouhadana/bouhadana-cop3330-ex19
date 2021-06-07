/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        int weight = 0;
        float height = 0;

        while(true){
            System.out.print("Enter weight (in pounds): ");
            try {
                weight = jb.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Try again!");
                jb.next();
                continue;
            }
            break;
        }

        while(true){
            System.out.print("Enter height (in inches): ");
            try {
                height = jb.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Try again!");
                jb.next();
                continue;
            }
            // System.out.println(weight);
            break;
        }

        float bmi = ((float) weight / (height * height)) * 703;
        System.out.println("Your BMI is "+ bmi);

        if(bmi < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi > 25)
            System.out.println("You are overweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range.");
    }
}

