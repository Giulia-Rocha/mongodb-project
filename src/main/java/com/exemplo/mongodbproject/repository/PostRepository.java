package com.exemplo.mongodbproject.repository;

import com.exemplo.mongodbproject.domain.Post;
import com.exemplo.mongodbproject.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {
}
