package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public List<Question> getQuestions(int amount) {
        if (amount <= questionService.getAll().size()) {
            List<Question> randomList = new ArrayList<>(List.of());
            for (int i = 0; i < amount; i++) {
                randomList.add(questionService.getRandomQuestion());
            }
            return randomList;
        } else {
            throw new ArithmeticException("Вопросов меньше");
        }
    }

}