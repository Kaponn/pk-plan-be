package com.pk_plan_be.model;

import com.pk_plan_be.converter.WeeklyAvailabilityConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private String mail;

    @OneToMany(mappedBy = "teacher")
    private List<Class> classes;

    @Convert(converter = WeeklyAvailabilityConverter.class)
    private WeeklyAvailability hours;
}