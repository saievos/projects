package com.sideproject.view;



import com.sideproject.dao.jdbc.JdbcQuestionDao;
import com.sideproject.model.Question;

import java.util.Collections;
import java.util.Scanner;

public class Menu {

    private static final Scanner userInput = new Scanner(System.in);

    public void printWelcome(){
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("**                                         **");
        System.out.println("**            Welcome to Flash!            **");
        System.out.println("**            (A FlashCard App)            **");
        System.out.println("**                                         **");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
    }

    public void multipleChoice(int num) {
        int choice = userInput.nextInt();

            while (true) {
                if (choice == 1) {
                    System.out.println();
                } else if (choice == 2) {
                    System.out.println();
                } else if (choice == 3) {
                    System.out.println();
                } else if (choice == 4) {
                    System.out.println();
                } else {
                    System.out.println("That is not a valid choice. Please try again.");
                }
            }
    }

    public void correctAnswer() {
        System.out.println();
    }
    public void incorrectAnswer() {
        System.out.println();
    }

    public void presentQuestion(Question question) {
        // Code to present the question and options to the user
        System.out.println(question.getQuestion());
    }

    public int getUserChoice() {
        // Code to accept user input for the choice
        // Return the user's choice as an integer
        String answer = userInput.nextLine();
        return Integer.parseInt(answer);
    }


}
