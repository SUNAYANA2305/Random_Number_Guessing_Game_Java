package org.Sunaycode.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        int randomNumber = ran.nextInt(20);

        System.out.println("******WELCOME TO RANDOM NUMBER GUESSING GAME****** ");
        System.out.print("Enter Your Name: ");

        String name = scn.next();
        System.out.println("Hello "+ name);

        System.out.println("Do you want to Start the game???? \nEnter Y to start. Enter Q to quit.");

        String yn = scn.next();
        int numberOfGuesses = 0;

        if (yn.equals("Y"))
        {
            while (numberOfGuesses<5) {
                System.out.print("Guess a number:");
                int guess = scn.nextInt();
                numberOfGuesses++;
                if (numberOfGuesses == 6) {
                    System.out.println("Sorry! You are out of guesses. \nThe number was:");
                    System.out.println(randomNumber);
                    System.out.println("Better Luck Next Time");
                }
                else{
                    if(randomNumber==guess){
                        System.out.println("Congratulations. You guessed it.");
                        break;
                    }
                    else {
                        if (guess>randomNumber) {
                            System.out.println("Wrong guess. Guess a lower number than that.");
                        }
                        else {
                            System.out.println("Wrong guess. Guess a higher number than that.");
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Bye Bye");
        }
    }
}
