package com.test.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeNumber", nullable = false)
    private Long actorId;
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "extension", nullable = false)
    private String extension;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "officeCode", nullable = false)
    private String officeCode;

    @Column(name = "reportsTo")
    private Long reportsTo;

    @Column(name = "jobTitle", nullable = false)
    private String jobTitle;
    
}
