package com.pacha.onlinevotingsystem.entity;




import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sess_id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date sess_date;

    @Column(columnDefinition = "boolean default false", nullable = false)
    private boolean sess_published;

    @Column(nullable = false)
    private String sess_description;

    @OneToMany(mappedBy = "session")
    @JsonIgnore
    private Set<Person> persons;

    @OneToMany(mappedBy = "session")
    @JsonIgnore
    private Set<Candidate> candidates;

}
