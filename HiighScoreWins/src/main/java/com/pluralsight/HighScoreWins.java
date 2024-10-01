package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner motherBoard = new Scanner(System.in);
        System.out.println("Enter Score: ");
        String scoreNumbersAndNames = motherBoard.next();

        System.out.println(scoreNumbersAndNames.split("\\|"));

    }
}
