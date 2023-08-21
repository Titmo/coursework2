//package com.example.coursework2.service;
//
//import com.example.coursework2.Question;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class JavaQuestionServiceTest {
//    private final JavaQuestionService javaQuestionService=new JavaQuestionService();
//        List<Question> questions=new ArrayList<>(List.of(
//                new Question("int какого типа переменная?","Целочисленная"),
//                new Question("int какого типа?","Приметанного")
//        ));
//
//
//
//    @Test
//    void add() {
//        String question="String";
//        String answer="int";
//
//        Question ex = javaQuestionService.add(question,answer);
//
//        Question question1 = new Question("String","int");
//        questions.add(question1);
//        Question act =questions.get(questions.indexOf(question1));
//         assertEquals(ex,act);
//    }
//
//    @Test
//    void questionAlreadyExists() {
//        String question="int";
//        String answer="int";
//
//        String expectedMessage = "Вопрос и ответ одинаковые";
//
//        Exception exception = assertThrows(RuntimeException.class, () -> {
//            javaQuestionService.add(question, answer);
//        });
//        assertEquals(expectedMessage, exception.getMessage());
//    }
//
//    @Test
//    void questionRepeats() {
//        String question="int какого типа?";
//        String answer="Приметанного";
//
//        String expectedMessage = "Вопрос уже существует";
//
//        Exception exception = assertThrows(RuntimeException.class, () -> {
//            javaQuestionService.add(question, answer);
//        });
//        assertEquals(expectedMessage, exception.getMessage());
//    }
//
//    @Test
//    void remove() {
//        String question="int какого типа переменная?";
//        String answer="Целочисленная";
//        Question question1 =new Question(question,answer);
//
//       Question ex= javaQuestionService.remove(question1);
//
//       assertEquals(ex,questions.get(0));
//    }
//
//    @Test
//    void getAll() {
//        List<Question> ex = javaQuestionService.getAll();
//
//        List<Question> act = questions;
//
//        assertEquals(ex,act);
//    }
//}