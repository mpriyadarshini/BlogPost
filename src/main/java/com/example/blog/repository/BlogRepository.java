package com.example.blog.repository;

import com.example.blog.models.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogPost,Integer>{


}
