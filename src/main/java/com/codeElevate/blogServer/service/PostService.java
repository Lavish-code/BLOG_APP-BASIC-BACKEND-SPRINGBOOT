package com.codeElevate.blogServer.service;


import com.codeElevate.blogServer.entity.Post;
import org.springframework.data.annotation.Id;

import java.util.List;

public interface PostService {
    @Id
    Post savePost(Post post);
    List<Post> getAllPosts();
    Post getPostById(String postId);
    Post updatePost(String postId, Post post); // Add this
    void deletePost(String postId); // Add this
}
