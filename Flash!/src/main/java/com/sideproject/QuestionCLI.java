package com.sideproject;

import com.sideproject.dao.jdbc.JdbcQuestionDao;
import com.sideproject.dao.jdbc.QuestionDao;
import com.sideproject.model.Question;
import com.sideproject.view.Menu;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class QuestionCLI {

    private static final Menu menu = new Menu();
    private static int score = 0;

    QuestionDao questionDao;
    public QuestionCLI(DataSource datasource) {
        questionDao = new JdbcQuestionDao(datasource);
    }

    public static void main(String[] args) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:postgresql://localhost:5432/Flash!");
        basicDataSource.setUsername("postgres");
        basicDataSource.setPassword("postgres1");

        QuestionCLI questionCLI = new QuestionCLI(basicDataSource);
        questionCLI.run();

    }

    private void run() {
        List<Question> questionList = new ArrayList<>();

        questionList = questionDao.getQuestion();

        while (!questionList.isEmpty()) {
            Question question = getRandomQuestion(questionList);
            menu.presentQuestion(question);

            System.out.println();
            int choice = menu.getUserChoice();

            if (choice >= 1 && choice <= 4) {
                if (question.isAnswerCorrect(choice)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 & 4.");
            }
            question.nextQuestion();
        }
        System.out.println("Game Over. Your score is: " + score);
    }


    private static Question getRandomQuestion(List<Question> questionList) {
        int randomIndex = (int) (Math.random() * questionList.size());
        return questionList.get(randomIndex);
    }
}
