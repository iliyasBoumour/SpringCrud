package com.iliyas.crudApi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "id")
public class Post extends AuditModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(max = 100)
	@Column(unique = true)
	private String title;

	@NotNull
	@Size(min = 5, max = 250)
	private String description;

	@NotNull
	@Lob
	@Column(nullable = false)
	private String content;

//    bidirectional : use mapped by
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	get the list and stop
//	@JsonManagedReference
	List<Comment> comments=new ArrayList<Comment>();


	
//	save a post
	// Create a Post
//	Post post = new Post("post title", "post description", "post content");

//	// Create Comments
//	Comment comment1 = new Comment("Great Post!");
//	comment1.setPost(post);
//	Comment comment2 = new Comment("Really helpful Post. Thanks a lot!");
//	comment2.setPost(post);

//	// Add comments in the Post
//	post.getComments().add(comment1);
//	post.getComments().add(comment2);

//	// Save Post and Comments via the Post entity
//	postRepository.save(post);
}
