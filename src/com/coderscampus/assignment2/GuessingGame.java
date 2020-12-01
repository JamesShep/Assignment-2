package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main (String [] args) {

        final int MAX_NUMBER = 100;
        final int MIN_NUMBER = 1;

        int maxNumberOfGuesses = 5;
        int playerGuessNumber = 0;

        int randomNumber;
        int playerGuess;

        Scanner input = new Scanner(System.in);

        Random random = new Random();
        randomNumber = random.nextInt(MAX_NUMBER)+1;

        System.out.println(randomNumber);

        while (playerGuessNumber < maxNumberOfGuesses) {
            System.out.println("Please pick a number between " + MIN_NUMBER + " and "
            + MAX_NUMBER);
            playerGuess = input.nextInt();

            if (playerGuess < MIN_NUMBER || playerGuess > MAX_NUMBER) {
                System.out.println("Your guess is not between " + MIN_NUMBER + " and " +
                        MAX_NUMBER + ". Please try again");
            }

            else if (playerGuess > randomNumber) {
                playerGuessNumber++;
            }
            else if (playerGuess < randomNumber) {
                System.out.println("Please pick a higher number");
                playerGuessNumber++;
            }
            else {
                System.out.println("Your guess of " + playerGuess + " is correct!");
                break;
            }
        }
        if (playerGuessNumber == maxNumberOfGuesses) {
            System.out.println("You lose!");
            System.out.println("The correct number to guess was: " + randomNumber);
        }
        input.close();
    }
}
