package com.project.mongoworkshop.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.mongoworkshop.domain.Post;
import com.project.mongoworkshop.repository.PostRepository;
import com.project.mongoworkshop.services.exception.ObjectNotFoundException;

public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Post user = repo.findById(id).orElse(null);
		if (user == null) {
			throw new ObjectNotFoundException("Object Not Found");
		}
		return user;
		}
	}