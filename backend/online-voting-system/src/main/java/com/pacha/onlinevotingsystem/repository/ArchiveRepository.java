package com.pacha.onlinevotingsystem.repository;

import com.pacha.onlinevotingsystem.entity.Archive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchiveRepository extends JpaRepository<Archive, Long> {
}
