package com.pjatk.quiz.app.quiz;

import com.pjatk.quiz.app.quiz.command.DeleteQuizCommand;

public class QuizFacade {
    private final QuizRepository quizRepository;

    public QuizFacade(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public void deleteQuiz(DeleteQuizCommand deleteQuizCommand) {
        quizRepository.deleteById(deleteQuizCommand.id());
    }
}
