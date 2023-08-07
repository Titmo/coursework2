package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    private ExaminerServiceImpl examinerService;
    List<Question> list = new ArrayList<>(List.of());
    private JavaQuestionService javaQuestionService;


    @BeforeEach
    void setUp() {
        Question question = new Question("int какого типа?", "Приметанного");
        list.add(question);
        javaQuestionService = Mockito.mock(JavaQuestionService.class);
        when(javaQuestionService.getAll()).thenReturn(list);
        examinerService = new ExaminerServiceImpl(javaQuestionService);
    }

    @Test
    void getQuestions() {
        int amount = 1;
        List<Question> ex = examinerService.getQuestions(1);

        List<Question> act = new ArrayList<>(List.of());
        for (int i = 0; i < amount; i++) {
            act.add(javaQuestionService.getRandomQuestion());
        }
        assertEquals(ex,act);
    }
}