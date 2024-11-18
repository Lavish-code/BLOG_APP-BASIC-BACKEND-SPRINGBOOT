package com.codeElevate.blogServer.repository;

import com.codeElevate.blogServer.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    // String type instead of Long for the ID
}
