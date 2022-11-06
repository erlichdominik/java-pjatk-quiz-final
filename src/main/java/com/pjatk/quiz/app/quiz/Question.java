package com.pjatk.quiz.app.quiz;

import com.pjatk.quiz.app.sharedkernel.AbstractEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class Question extends AbstractEntity {
    private int questionNumber;

    private String comment;
    private String text;

    @ManyToOne
    @JoinColumn(name = "pathway_id")
    private Pathway pathway;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private Set<Answer> answers = new HashSet<>();

    protected Question() {}


}
