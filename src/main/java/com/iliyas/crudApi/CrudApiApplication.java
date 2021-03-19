package com.iliyas.crudApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.iliyas.crudApi.dao.CommentRepository;
import com.iliyas.crudApi.entities.Comment;

@SpringBootApplication
@EnableJpaAuditing
public class CrudApiApplication implements CommandLineRunner {

	@Autowired
	CommentRepository commentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Comment> comments= commentRepository.findAll();
////		System.out.println(comments);
//		comments.forEach(cm->{
//			System.out.println(cm.toString());
//		});
		
	}

}
