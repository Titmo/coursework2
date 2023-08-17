package com.example.coursework2.service;

import com.example.coursework2.Question;
import com.example.coursework2.repository.MathQuestionRepository;
import com.example.coursework2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Repository
public class MathQuestionService implements QuestionService {
    private final QuestionRepository mathQuestionRepository;

    public MathQuestionService(@Qualifier("mathQuestionRepository") QuestionRepository mathQuestionRepository) {
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return mathQuestionRepository.add(question, answer);
    }


    @Override
    public Question add(Question question) {
//        mathList.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        return mathQuestionRepository.remove(question);
    }

    @Override
    public List<Question> getAll() {
        return mathQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomInt = random.nextInt(getAll().size());
        return getAll().get(randomInt);
    }
}
