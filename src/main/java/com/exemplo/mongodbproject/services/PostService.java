package com.exemplo.mongodbproject.services;

import com.exemplo.mongodbproject.domain.Post;
import com.exemplo.mongodbproject.domain.User;
import com.exemplo.mongodbproject.repository.PostRepository;
import com.exemplo.mongodbproject.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto Não Encontrado"));
    }
    public List<Post> findByTitle(String text){
        return postRepository.findByTitleContainingIgnoreCase(text);
    }

}
