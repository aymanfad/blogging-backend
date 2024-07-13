package com.exemple.bloggingbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Article> articles;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Comment> comments;
}
