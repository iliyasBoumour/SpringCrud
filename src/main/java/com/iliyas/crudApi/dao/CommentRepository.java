package com.iliyas.crudApi.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iliyas.crudApi.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	public Page<Comment> findByPostId(Long postId,Pageable pageable);
}
