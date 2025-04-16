package com.example.gradeflow.repository;

import com.example.gradeflow.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
