package com.ronaldsm.preparcial.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Data
@Entity
@Table(name = "assignment_tbl")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "assignment_code")
    private UUID assignmentCode;
    @Column(nullable = false)
    private String assignmentName;
    private String assignmentDescription;
    private Date assignmentCompleted;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_code")
    private Course course;


}
