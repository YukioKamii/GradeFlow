package com.example.gradeflow.service;

import com.example.gradeflow.model.Grade;
import com.example.gradeflow.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    private GradeRepository gradeRepository;

    public Double getAverageGradeForStudent(Long studentId) {
        List<Grade> grades = gradeRepository.findByStudentId(studentId);
        return grades.stream()
                .mapToDouble(Grade::getValue)
                .average()
                .orElse(0.0);
    }

    public Double getAverageGradeForCourse(Long courseId) {
        List<Grade> grades = gradeRepository.findByCourseId(courseId);
        return grades.stream()
                .mapToDouble(Grade::getValue)
                .average()
                .orElse(0.0);
    }
}
