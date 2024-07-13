package com.exemple.bloggingbackend.repositories;

import com.exemple.bloggingbackend.entities.Article;
import com.exemple.bloggingbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
