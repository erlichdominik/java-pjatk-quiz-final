package com.pjatk.quiz.app.user;

import com.pjatk.quiz.app.sharedkernel.AbstractEntity;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
public class Walkthrough extends AbstractEntity {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String quizName;
    private int correctAnswers;
    @ManyToOne
    private User user;

    protected Walkthrough() {
    }

    public Walkthrough(LocalDateTime startTime, LocalDateTime endTime, String quizName, int correctAnswers, User user) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.quizName = quizName;
        this.correctAnswers = correctAnswers;
        this.user = user;
    }
}
