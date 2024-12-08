package com.pk_plan_be.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private int semester;

    @NotNull
    private ClassTypes type;

    @NotNull
    private int numOfStudents;

    private int groupSize;

    @ElementCollection
    private List<String> roomRequirements;

    @NotNull
    private int numOfHours;

    @NotNull
    private boolean isRequired;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}