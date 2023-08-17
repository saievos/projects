package com.sideproject.dao.jdbc;

import com.sideproject.model.Question;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Focuses on using JdbcTemplate to interact with the database (via DataSource Class)
public class JdbcQuestionDao implements QuestionDao {

    private final JdbcTemplate jdbcTemplate;


    public JdbcQuestionDao(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //entry point for fetching question data from the database/dataSource connection
    @Override
    public List<Question> getQuestion() {
        List<Question> questionList = new ArrayList<>();
        String sql = "SELECT question_id, question, answer, false1, false2, false3 FROM question";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            questionList.add(mapRow(results));
            }
            return questionList;
    }

    //this method is utility for the getQuestion method, providing separation of concerns
    //it also encapsulates the logic of converting rows into the question object
    //& makes it modular (also, if changes need to be made later it will be simple)
    private Question mapRow(SqlRowSet rowSet) {
            int questionId = rowSet.getInt("question_id");
            String question = rowSet.getString("question");
            String answer = rowSet.getString("answer");
            String false1 = rowSet.getString("false1");
            String false2 = rowSet.getString("false2");
            String false3 = rowSet.getString("false3");
            return new Question(questionId, question, answer, false1, false2, false3);
    }


}
