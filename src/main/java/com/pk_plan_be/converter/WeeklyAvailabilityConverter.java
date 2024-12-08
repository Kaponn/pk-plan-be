package com.pk_plan_be.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk_plan_be.model.WeeklyAvailability;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class WeeklyAvailabilityConverter implements AttributeConverter<WeeklyAvailability, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(WeeklyAvailability attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Error converting WeeklyAvailability to JSON", e);
        }
    }

    @Override
    public WeeklyAvailability convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, WeeklyAvailability.class);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Error converting JSON to WeeklyAvailability", e);
        }
    }
}