package com.evaluation.evaluation.dto;

import com.evaluation.evaluation.entity.CourseStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter @Setter
public class CourseDTO {

    private Long id;
    private String description;
    private CourseStatus status;
    private LocalDate dueDate;
    private Instant createdAt;
    private Instant updatedAt;

}
