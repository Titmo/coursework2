package com.example.coursework2.service;

import com.example.coursework2.Question;
import com.example.coursework2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class JavaQuestionService implements QuestionService {
    private final QuestionRepository javaQuestionRepository;

    public JavaQuestionService(@Qualifier("javaQuestionRepository") QuestionRepository javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    private Random random;

    @Override
    public Question add(String question, String answer) {
        return javaQuestionRepository.add(question,answer);
    }

    @Override
    public Question add(Question question) {
//        question.getQuestion()
//        javaList.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
       return javaQuestionRepository.remove(question);
    }

    @Override
    public List<Question> getAll() {
        return javaQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        this.random = new Random();
        int randomInt = random.nextInt(getAll().size());
        return getAll().get(randomInt);
    }
}
