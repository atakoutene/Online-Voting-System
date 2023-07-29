package com.pacha.onlinevotingsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "archives")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long arcId;

    @Column(nullable = false, unique = true)
    private long sessionId;

    @Column(nullable = false)
    private String winnerName;

    @Column(nullable = false)
    @Lob
    private byte[] winnerPlan;

    @Column(nullable = false)
    @Lob
    private byte[] winnerPicture;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishedDate;
}
