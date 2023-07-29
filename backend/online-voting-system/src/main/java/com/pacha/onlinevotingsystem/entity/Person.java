package com.pacha.onlinevotingsystem.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long perId;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "registration number can not be left blank")
    private String registrationNumber;

    @Column(nullable = false, unique = true)
    @Email
    private String email;

    @NotBlank(message = "name can not be left blank")
    private  String name;

    @NotBlank(message = "date of birth can not be left blank")
    @Column(nullable = false)
    private Date dob;

    @Column(columnDefinition = "text default 'user'", nullable = false)
    private String role;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private  boolean muted;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private boolean voted;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private boolean liked;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private boolean disliked;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Session session;

    @OneToOne(mappedBy = "person")
    @JsonIgnore
    private Candidate candidate;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private Set<Comment> comments;



}
