package com.example.coursework2.controller;

import com.example.coursework2.Question;
import com.example.coursework2.repository.QuestionRepository;
import com.example.coursework2.service.JavaQuestionService;
import com.example.coursework2.service.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exam/java")
public class JavaController {
    private final QuestionService questionService;

    public JavaController(@Qualifier("javaQuestionRepository") QuestionService questionService) {
        this.questionService = questionService;
    }



    @GetMapping(path = "/add")
    public Question add(@RequestParam String question,
                        @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/remove")
    public Question remove(@RequestParam String question,
                           @RequestParam String answer) {
        Question questions =new Question(question,answer);
        return questionService.remove(questions);
    }

    @GetMapping(path = "/getAll")
    public List<Question> getAll() {
        return questionService.getAll();
    }

}
