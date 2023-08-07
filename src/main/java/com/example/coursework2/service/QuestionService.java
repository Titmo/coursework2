package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.List;

public interface QuestionService {
    Question add (String question,String answer);
    Question add (Question question);
    Question remove (Question question);
    List<Question> getAll();
    Question getRandomQuestion ();

}
