package com.sideproject.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private int questionId;
    private String question;
    private List<String> options; //sub-sort for answer, false1, false2, false3 (multiple choice 1-4)
    private int currentIndex;


    public Question(int questionId, String question, String answer, String false1, String false2, String false3) {
        this.questionId = questionId;
        this.question = question;
        this.options = new ArrayList<>();
        this.options.add(answer);
        this.options.add(false1);
        this.options.add(false2);
        this.options.add(false3);
        Collections.shuffle(this.options);
        this.currentIndex = 0;
    }

    public Question() {
        //Variable to hold 'deck' and counter to keep track as user iterates
        List<Question> flashCardDeck = new ArrayList<>();
        currentIndex = 0;
    }
    public String getQuestion() {
        return question;
    }

    public List<String> getShuffledOptions() {
        return new ArrayList<>(options);
    }
    public String getOption(int index) {
        return options.get(index - 1);
    }
    public boolean isAnswerCorrect(int choice) {
        String selectedAnswer = getOption(choice);
        return selectedAnswer.equals(options.get(0));
    }

    public boolean hasMoreOptions() {
        return currentIndex < options.size() - 1;
    }

    public void nextQuestion() {
        currentIndex++;
    }
}
