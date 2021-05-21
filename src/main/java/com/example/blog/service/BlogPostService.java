package com.example.blog.service;


import com.example.blog.dto.BlogPostDTO;
import com.example.blog.models.BlogPost;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;


@Service
public class BlogPostService {


    @Autowired
    BlogRepository blogRepository;
    public Iterable<BlogPost> getAllBlogPosts(){
        return blogRepository.findAll();
    }

    public BlogPost getBlogById(int id){
        return blogRepository.findById(id);
    }
    

    public void saveBlog(BlogPost blogPost){
        blogRepository.save(blogPost);
    }
    public void deleteBlog(long id){
        blogRepository.deleteById(id);
    }

    public void updateBlog(BlogPostDTO blogPostDTO, long id){
        BlogPost identity = blogRepository.findById(id);
        boolean value = false;
        if (StringUtils.hasLength(blogPostDTO.getTitle())) {
            identity.setTitle(blogPostDTO.getTitle());
            value = true;
        }
        if(StringUtils.hasLength(blogPostDTO.getDescription())){
            identity.setDescription(blogPostDTO.getDescription());
            value = true;
        }
        if(value) {
            blogRepository.save(identity);
        }
    }
}
