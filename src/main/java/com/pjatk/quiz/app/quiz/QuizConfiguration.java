package com.pjatk.quiz.app.quiz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class QuizConfiguration {
    private final QuizRepository quizRepository;

    QuizConfiguration(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Bean
    QuizFinder quizFinder() {
       return new QuizFinder(quizRepository);
    }

    @Bean
    QuizFacade quizFacade() {
        return new QuizFacade(quizRepository);
    }
}
