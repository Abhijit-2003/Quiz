package com.abhi.quiz.quizApplication.service;

import com.abhi.quiz.quizApplication.entity.QuizQuestion;
import com.abhi.quiz.quizApplication.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<QuizQuestion> getAllQuestions()
    {
        List<QuizQuestion> questionRepoAll = questionRepository.findAll();
        return questionRepoAll;
    }

    public QuizQuestion saveQuestion(QuizQuestion question){
        QuizQuestion save = questionRepository.save(question);
        return save;
    }
}
