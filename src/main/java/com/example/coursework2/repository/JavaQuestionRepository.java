package com.example.coursework2.repository;

import com.example.coursework2.Question;
import com.example.coursework2.service.QuestionService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class JavaQuestionRepository implements QuestionRepository {
    List<Question> javaList = new ArrayList<>(List.of(
            new Question("int какого типа переменная?","Целочисленная"),
            new Question("int какого типа?","Приметанного")
    ));

    @Override
    public Question add(String question, String answer) {
        if (!question.equals(answer)) {
            Question questions = new Question(question, answer);
            if (!javaList.contains(questions)) {
                javaList.add(questions);
                return questions;
            } else {
                throw new RuntimeException("Вопрос уже существует");
            }
        }
        throw new RuntimeException("Вопрос и ответ одинаковые");
    }

    @Override
    public Question remove(Question question) {
        javaList.remove(question);
        return question;
    }

    @Override
    public List<Question> getAll() {
        return javaList;
    }
}
