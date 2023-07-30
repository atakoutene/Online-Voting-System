package com.pacha.onlinevotingsystem.repository;

import com.pacha.onlinevotingsystem.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
