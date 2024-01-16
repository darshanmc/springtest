package com.test.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id", nullable = false)
    private Long actorId;
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)  // yyyy-MM-dd HH:mm:ss.SSSSSS
    private Date lastUpdate;


}
