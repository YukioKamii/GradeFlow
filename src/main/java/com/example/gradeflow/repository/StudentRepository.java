package com.example.gradeflow.repository;

import com.example.gradeflow.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
