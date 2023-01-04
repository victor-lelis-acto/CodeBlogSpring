package com.spring.codeblog.repository;

import com.spring.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CodeBlogRepository extends JpaRepository<Post, Long>, JpaSpecificationExecutor<Post> {

}
