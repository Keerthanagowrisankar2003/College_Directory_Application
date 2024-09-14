package com.example.collegedirectory.service;

import com.example.collegedirectory.entity.StudentProfile;
import com.example.collegedirectory.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public StudentProfile getStudentProfileById(Long id) {
        return studentProfileRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public StudentProfile updateStudentProfile(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    public List<StudentProfile> searchStudents(String name, String department) {
        // Implement the logic to search for students based on name and department.
        // You can add custom queries to your repository or just filter in Java
        return studentProfileRepository.findAll();  // Replace with actual logic.
    }
}
