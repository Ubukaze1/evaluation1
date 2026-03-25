package com.evaluation.evaluation.controller;

import com.evaluation.evaluation.dto.CourseDTO;
import com.evaluation.evaluation.dto.CreaterCourseDTO;
import com.evaluation.evaluation.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    private final CourseService service;
    private CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDTO create(@Valid @RequestBody CreaterCourseDTO request) {
        return service.create(request);
    }

    @GetMapping
    public List<CourseDTO> list() {
        return service.list();
    }
}
