package com.pacha.onlinevotingsystem.repository;

import com.pacha.onlinevotingsystem.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
