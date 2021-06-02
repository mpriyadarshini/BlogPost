package com.example.blog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="\"user\"")
public class User{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    private String password;

    @OneToMany(mappedBy="createdBy")
    private List<BlogPost> blogPost;

    public User(Long id, String name, List<BlogPost> blogPost) {
        this.id = id;
        this.name = name;
        this.blogPost = blogPost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BlogPost> getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(List<BlogPost> blogPost) {
        this.blogPost = blogPost;
    }
}