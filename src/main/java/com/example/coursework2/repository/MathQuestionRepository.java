package com.example.coursework2.repository;

import com.example.coursework2.Question;
import com.example.coursework2.service.QuestionService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MathQuestionRepository implements QuestionRepository {
    List<Question> mathList = new ArrayList<>(List.of(
            new Question("2+2= ", "4"),
            new Question("2*3= ", "6")
    ));


    @Override
    public Question add(String question, String answer) {
        if (!question.equals(answer)) {
            Question questions = new Question(question, answer);
            if (!mathList.contains(questions)) {
                mathList.add(questions);
                return questions;
            } else {
                throw new RuntimeException("Вопрос уже существует");
            }
        }
        throw new RuntimeException("Вопрос и ответ одинаковые");
    }

    @Override
    public Question remove(Question question) {
        mathList.remove(question);
        return question;
    }

    @Override
    public List<Question> getAll() {
        return mathList;
    }
}