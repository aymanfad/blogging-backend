package com.exemple.bloggingbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private Date createdAt;
    @ManyToOne
    private User user;
    @ManyToOne
    private Article article;
}
