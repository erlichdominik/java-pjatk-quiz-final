package com.pjatk.quiz.endpoints;

import com.pjatk.quiz.app.quiz.QuizFacade;
import com.pjatk.quiz.app.quiz.QuizFinder;
import com.pjatk.quiz.app.quiz.dto.QuizName;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Endpoint
@RolesAllowed({"ADMIN", "USER"})
public class QuizEndpoint {
    private final QuizFacade quizFacade;
    private final QuizFinder quizFinder;

    public QuizEndpoint(QuizFacade quizFacade, QuizFinder quizFinder) {
        this.quizFacade = quizFacade;
        this.quizFinder = quizFinder;
    }

    @Nonnull
    public List<@Nonnull QuizName> fetchQuizNames() {
        return quizFinder.fetchQuizNames();
    }
}
