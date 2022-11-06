package com.pjatk.quiz.app.quiz;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

interface QuizRepository extends Repository<Quiz, UUID> {

    void deleteById(UUID id);

    List<Quiz> findAll();

    void save(Quiz quiz);
}
