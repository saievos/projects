package com.sideproject.dao.jdbc;

import com.sideproject.model.Question;

import java.sql.SQLException;
import java.util.List;

public interface QuestionDao {

    //entry point for fetching question data from the database/dataSource connection
    List<Question> getQuestion();
}
