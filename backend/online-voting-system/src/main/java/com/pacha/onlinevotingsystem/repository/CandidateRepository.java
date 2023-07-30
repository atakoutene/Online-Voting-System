package com.pacha.onlinevotingsystem.repository;

import com.pacha.onlinevotingsystem.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
