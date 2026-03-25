package com.evaluation.evaluation.service;

import com.evaluation.evaluation.dto.CourseDTO;
import com.evaluation.evaluation.dto.CreaterCourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO create(CreaterCourseDTO request);
    List<CourseDTO> list();
}
