package com.fitness.activityservice.dto;

import com.fitness.activityservice.model.ActivityType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityRequest {
    private String userId;
    private ActivityType type;  //we are just saving this id directly into the database without validating from user-service
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Map<String, Object> additionalMetrics;


}
