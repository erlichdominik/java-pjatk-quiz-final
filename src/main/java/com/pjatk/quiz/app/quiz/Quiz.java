package com.pjatk.quiz.app.quiz;

import com.pjatk.quiz.app.sharedkernel.AbstractEntity;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class Quiz extends AbstractEntity {
    private String name;

    @OneToMany(mappedBy = "quiz")
    private Set<Pathway> pathways = new HashSet<>();

    protected Quiz() {}

    public Quiz(String name, Set<Pathway> pathways) {
        this.name = name;
        this.pathways = pathways;
    }
}
