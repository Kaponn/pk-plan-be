package com.pk_plan_be.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class WeeklyAvailability implements Serializable {
    private Map<String, List<TimeRange>> availability;

}