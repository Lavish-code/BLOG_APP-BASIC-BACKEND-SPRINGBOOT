package com.codeElevate.blogServer.service;


import com.codeElevate.blogServer.entity.Post;
import com.codeElevate.blogServer.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository ;

    public Post savePost(Post post){
        post.setViewCount(0);
        post.setDate(new Date());
        return postRepository.save(post) ;
    }

    public List<Post> getAllPosts(){
       return postRepository.findAll();
    }

    public Post getPostById(String postId){
         Optional<Post> optionalPost =postRepository.findById(postId);
         if(optionalPost.isPresent()){
             Post post = optionalPost.get();
             post.setViewCount(post.getViewCount()+1);
             return postRepository.save(post);
         }else{
             throw new NoSuchElementException("post not found");
         }
    }

    @Override
    public Post updatePost(String postId, Post updatedPost) {
        Optional<Post> optionalPost = postRepository.findById(postId);
        if (optionalPost.isPresent()) {
            Post existingPost = optionalPost.get();
            // Update the fields you want to allow updating
            existingPost.setName(updatedPost.getName());
            existingPost.setContent(updatedPost.getContent());
            // Don't update viewCount and date as they should be preserved
            return postRepository.save(existingPost);
        } else {
            throw new NoSuchElementException("Post not found with id: " + postId);
        }
    }

    @Override
    public void deletePost(String postId) {
        if (postRepository.existsById(postId)) {
            postRepository.deleteById(postId);
        } else {
            throw new NoSuchElementException("Post not found with id: " + postId);
        }
    }


}
