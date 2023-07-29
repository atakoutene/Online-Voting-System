package com.pacha.onlinevotingsystem.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Set;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @Column(nullable = false)
    @Lob
    private byte[] picture;

    @Column(nullable = false)
    private int likes;

    @Column(nullable = false)
    private int dislikes;

    @OneToOne(cascade = CascadeType.ALL)
    private Candidate candidate;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private Set<Comment> comments;
}
