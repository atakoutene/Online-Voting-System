package com.pacha.onlinevotingsystem.repository;

import com.pacha.onlinevotingsystem.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
