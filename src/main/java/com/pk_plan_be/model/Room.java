package com.pk_plan_be.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String buildingName;

    @NotNull
    private String roomNumber;

    @NotNull
    private int capacity;

    @ElementCollection
    private List<RoomFeatures> features;
}