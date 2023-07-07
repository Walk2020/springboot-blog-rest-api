package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    //JpaRepository has already all methods we need, and hibernate will implement them
    List<Post> findByCategoryId(Long categoryId);
}
