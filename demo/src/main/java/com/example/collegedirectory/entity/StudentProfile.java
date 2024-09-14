package com.example.collegedirectory.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String year;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
