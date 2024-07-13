package com.exemple.bloggingbackend.entities;

import com.exemple.bloggingbackend.enums.ArticleCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private ArticleCategory category;
    private Date createdAt;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "article",fetch = FetchType.LAZY)
    private List<Comment> comments;
}
