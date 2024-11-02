package com.abhi.quiz.quizApplication.repository;

import com.abhi.quiz.quizApplication.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuizQuestion,Long> {
}