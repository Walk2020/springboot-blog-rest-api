package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String body;

    //many is comments, one is post, one posts have multiple comments
    //FetchType.LAZY tells hibernate to only fetch the related entities from the database when you use the relationship
    //associated entity is not loaded from the database until it is actually accessed or referenced in the code.
    @ManyToOne(fetch = FetchType.LAZY)

    //indicate that post is a foreng
    @JoinColumn(name = "post_id", referencedColumnName = "id" ,nullable = false)
    private Post post;
}
