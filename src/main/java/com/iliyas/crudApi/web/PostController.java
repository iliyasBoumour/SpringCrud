package com.iliyas.crudApi.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iliyas.crudApi.dao.CommentRepository;
import com.iliyas.crudApi.dao.PostRepository;
import com.iliyas.crudApi.entities.Post;

@RestController
public class PostController {

	@Autowired
	PostRepository postRepository;
	
	@GetMapping("/posts")
	public Page<Post> getAllPosts(Pageable pageable) {
        return postRepository.findAll(pageable);
    }
	
	@PostMapping("/posts")
    public Post createPost(@Valid @RequestBody Post post) {
        return postRepository.save(post);
    }
	
//	@PutMapping("/posts/{postId}")
//    public Post updatePost(@PathVariable Long postId, @Valid @RequestBody Post postRequest) {
//        return postRepository.findById(postId).map(post -> {
//            post.setTitle(postRequest.getTitle());
//            post.setDescription(postRequest.getDescription());
//            post.setContent(postRequest.getContent());
//            return postRepository.save(post);
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }
//
//
//    @DeleteMapping("/posts/{postId}")
//    public ResponseEntity<?> deletePost(@PathVariable Long postId) {
//        return postRepository.findById(postId).map(post -> {
//            postRepository.delete(post);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }
}
