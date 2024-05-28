package com.ronaldsm.preparcial.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "course_code")
    private UUID id;
    @Column(nullable = false)
    private String name;
    private String courseDescription;
    private String numberOfAssignments;
    private String activeUsers;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Assignment> assignments;



}
