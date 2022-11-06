package com.pjatk.quiz.app.quiz;

import com.pjatk.quiz.app.sharedkernel.AbstractEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class Pathway extends AbstractEntity {
    private long pathwayNumber;
    private Long nextPathwayNumber;
    private String pathwayName;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    @OneToMany(mappedBy = "pathway", fetch = FetchType.EAGER)
    private Set<Question> questions = new HashSet<>();

}
