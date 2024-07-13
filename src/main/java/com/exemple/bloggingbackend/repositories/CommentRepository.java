package com.exemple.bloggingbackend.repositories;

import com.exemple.bloggingbackend.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
