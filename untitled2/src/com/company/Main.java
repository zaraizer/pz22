package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] questions = {
                "1. What does 'Just' mean?",
                "2. What does 'Already' mean?",
                "3. What does 'Yet' mean?",
                "4. What does 'Still' mean?",
                "5. Choose the correct word to complete the sentence:\n" +
                        "'I haven't finished my work ______.'"
        };

        String[][] options = {
                {"a) Recently", "b) Previously", "c) Already", "d) Yet"},
                {"a) In the future", "b) Before the expected time", "c) At this moment", "d) Already"},
                {"a) Up to now", "b) In the past", "c) Yet to happen", "d) Already"},
                {"a) In the near future", "b) Currently", "c) Not anymore", "d) Already"},
                {"a) just", "b) already", "c) yet", "d) still"}
        };

        String[] answers = {"a", "d", "c", "b", "d"};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the English Quiz!");
        System.out.println("Answer the following questions:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            String userAnswer;
            do {
                System.out.print("Enter your answer (a, b, c, or d): ");
                userAnswer = scanner.nextLine().toLowerCase();
            } while (!userAnswer.matches("[abcd]"));

            if (userAnswer.equals(answers[i])) {
                score++;
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        System.out.println("\nCorrect Answers:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + " Answer: " + answers[i]);
        }
    }
}

