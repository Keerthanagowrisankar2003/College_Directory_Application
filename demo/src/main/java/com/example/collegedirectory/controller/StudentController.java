package com.example.collegedirectory.controller;

import com.example.collegedirectory.entity.StudentProfile;
import com.example.collegedirectory.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/profile/{id}")
    public StudentProfile getStudentProfile(@PathVariable Long id) {
        return studentService.getStudentProfileById(id);
    }

    @PutMapping("/profile")
    public StudentProfile updateStudentProfile(@RequestBody StudentProfile profile) {
        return studentService.updateStudentProfile(profile);
    }

    @GetMapping("/search")
    public List<StudentProfile> searchStudents(@RequestParam String name, @RequestParam String department) {
        return studentService.searchStudents(name, department);
    }
}
