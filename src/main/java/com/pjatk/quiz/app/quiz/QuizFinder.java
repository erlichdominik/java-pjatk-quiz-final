package com.pjatk.quiz.app.quiz;

import com.pjatk.quiz.app.quiz.dto.QuizName;

import java.util.List;

public class QuizFinder {
   private final QuizRepository quizRepository;

    public QuizFinder(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<QuizName> fetchQuizNames() {
        return quizRepository.findAll()
                .stream()
                .map(it -> new QuizName(it.getId(), it.getName()))
                .toList();
    }


}
