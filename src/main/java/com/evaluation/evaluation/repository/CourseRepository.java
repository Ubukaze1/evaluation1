package com.evaluation.evaluation.repository;

import com.evaluation.evaluation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
