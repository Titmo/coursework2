package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount);

}
