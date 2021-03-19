package com.iliyas.crudApi.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iliyas.crudApi.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
