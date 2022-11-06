package com.pjatk.quiz.app.quiz.dto;

import java.util.Objects;
import java.util.UUID;

public class QuizName {
    private final UUID id;
    private final String name;

    public QuizName(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuizName quizName1 = (QuizName) o;
        return name.equals(quizName1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
