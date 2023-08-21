package com.example.coursework2.repository;

import com.example.coursework2.Question;

import java.util.List;

public interface QuestionRepository {
    Question add (String question, String answer);
    Question remove (Question question);
    List<Question> getAll();
}
