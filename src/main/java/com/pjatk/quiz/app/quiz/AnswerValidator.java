package com.pjatk.quiz.app.quiz;

import com.pjatk.quiz.app.quiz.dto.QuestionNotFoundException;

import java.util.UUID;

public class AnswerValidator {
    private final AnswerRepository answerRepository;

    AnswerValidator(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public boolean validate(UUID answerId) {
        return answerRepository.findById(answerId).orElseThrow(QuestionNotFoundException::new).isTrue();
    }
}
