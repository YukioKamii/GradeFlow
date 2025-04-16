package com.example.gradeflow.controller;

import com.example.gradeflow.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/student/{studentId}")
    public Double getAverageByStudent(@PathVariable Long studentId) {
        return reportService.getAverageGradeForStudent(studentId);
    }

    @GetMapping("/course/{courseId}")
    public Double getAverageByCourse(@PathVariable Long courseId) {
        return reportService.getAverageGradeForCourse(courseId);
    }
}
