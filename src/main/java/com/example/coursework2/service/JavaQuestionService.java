package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class JavaQuestionService implements QuestionService {
    List<Question> javaList = new ArrayList<>(List.of(
            new Question("int какого типа переменная?","Целочисленная"),
            new Question("int какого типа?","Приметанного")
    ));
    private Random random;

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
    public Question add(Question question) {
        javaList.add(question);
        return question;
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

    @Override
    public Question getRandomQuestion() {
        this.random = new Random();
        int randomInt = random.nextInt(javaList.size());
        return javaList.get(randomInt);
    }
}
