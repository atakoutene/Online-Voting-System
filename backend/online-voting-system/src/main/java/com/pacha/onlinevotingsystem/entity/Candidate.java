package com.pacha.onlinevotingsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Entity
@Table(name = "candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long canId;

    @NotBlank(message = "message can not be left blank")
    @Column(nullable = false)
    private String message;

    @Lob
    @Column(nullable = false)
    private byte[] plan;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Session session;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;


}
