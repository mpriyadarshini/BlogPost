package com.example.blog.models;

import com.example.blog.models.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name="blog")
public class BlogPost{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name="id",nullable=false)
    private User createdBy;

    private Timestamp createdAt;

    private User updatedBy;

    private Timestamp updatedAt;




}