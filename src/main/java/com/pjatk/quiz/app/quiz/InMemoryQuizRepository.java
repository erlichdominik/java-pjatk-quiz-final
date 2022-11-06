package com.pjatk.quiz.app.quiz;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

class InMemoryQuizRepository implements QuizRepository {
    private final Function<Quiz, UUID> idGetter;
    private final HashMap<UUID, Quiz> db = new HashMap<>();

    InMemoryQuizRepository(Function<Quiz, UUID> idGetter) {
        this.idGetter = idGetter;
    }

    @Override
    public void deleteById(UUID id) {
        db.remove(id);
    }

    @Override
    public List<Quiz> findAll() {
        return db.values().stream().toList();
    }

    @Override
    public void save(Quiz quiz) {
        db.put(idGetter.apply(quiz), quiz);
    }
}
