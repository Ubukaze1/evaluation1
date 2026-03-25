package com.evaluation.evaluation.service.impl;

import com.evaluation.evaluation.dto.CourseDTO;
import com.evaluation.evaluation.dto.CreaterCourseDTO;
import com.evaluation.evaluation.entity.Course;
import com.evaluation.evaluation.repository.CourseRepository;
import com.evaluation.evaluation.service.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;
    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public CourseDTO create(CreaterCourseDTO request){
        Course c = new Course();
        c.setDescription(request.getDescription());
        c.setStatus(request.getStatus());
        c.setDueDate(request.getDueDate());
        Course save = repository.save(c);
        return toResponse(save);

    }

    @Override
    @Transactional(readOnly = true)
    public List<CourseDTO> list() {
        return repository.findAll().stream().map(this::toResponse).toList();

    }

    private CourseDTO toResponse(Course a) {
        CourseDTO c = new CourseDTO();
        c.setId(a.getId());
        c.setDescription(a.getDescription());
        c.setStatus(a.getStatus());
        c.setDueDate(a.getDueDate());
        c.setCreatedAt(a.getCreatedAt());
        c.setUpdatedAt(a.getUpdatedAt());
        return c;
    }

}
