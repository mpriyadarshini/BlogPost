package com.example.blog.controllers;

import com.example.blog.dto.BlogPostDTO;
import com.example.blog.models.BlogPost;
import com.example.blog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogPostController {

    @Autowired
    BlogPostService blogService;

    @GetMapping("/blog")
    private Iterable<BlogPost> getAllBlogPost(){
        return blogService.getAllBlogPosts();
    }

    @GetMapping("/blog/{blog_id}")
    private BlogPost getBlogPost(@PathVariable() int blog_id){
        return blogService.getBlogById(blog_id);
    }

    @PostMapping("/blog")
    private void saveBlog(@RequestBody BlogPost blogPost){
        blogService.saveBlog(blogPost);

    }

    @DeleteMapping("/blog/{blog_id}")
    private void deleteBlog(@PathVariable("blog_id") int blog_id){
        blogService.deleteBlog(blog_id);
    }

    @PatchMapping("/blog/{blog_id}")
    private void updateBlog(@RequestBody BlogPostDTO blogPostDTO, @PathVariable("blog_id") int blog_id){
        blogService.updateBlog(blogPostDTO,blog_id);
    }



}
