package com.pjatk.quiz.app.quiz;

import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

interface AnswerRepository extends Repository<Answer, UUID> {
    Optional<Answer> findById(UUID id);
}
