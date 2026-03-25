package com.evaluation.evaluation.dto;

import com.evaluation.evaluation.entity.CourseStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class CreaterCourseDTO {

    @Size(max = 2000, message = "description must be <= 2000 chars")
    private String description;

    private CourseStatus status = CourseStatus.AVAILABLE;

    private LocalDate dueDate;

}
