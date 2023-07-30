package com.pacha.onlinevotingsystem.repository;

import com.pacha.onlinevotingsystem.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
