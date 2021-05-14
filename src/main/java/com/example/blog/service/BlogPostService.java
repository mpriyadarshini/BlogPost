package com.example.blog.service;


import com.example.blog.models.BlogPost;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostService {


    @Autowired
    BlogRepository blogRepository;
    public List<BlogPost> getAllBlogPosts(){
        List<BlogPost> blogPosts = new ArrayList<>();
        blogRepository.findAll();
        return blogPosts;
    }

    public BlogPost getBlogById(int id){
        return blogRepository.findById(id).get();
    }

    public void saveBlog(BlogPost blogPost){
        blogRepository.save(blogPost);
    }
    public void deleteBlog(int id){
        blogRepository.deleteById(id);
    }
    public void updateBlog(BlogPost blogPost){
        blogRepository.save(blogPost);
    }
}
