package com.exemplo.mongodbproject.services;

import com.exemplo.mongodbproject.domain.User;
import com.exemplo.mongodbproject.dto.UserDTO;
import com.exemplo.mongodbproject.repository.UserRepository;
import com.exemplo.mongodbproject.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(()-> new ObjectNotFoundException("Objeto Não Encontrado"));
    }
    public User insert(User obj){
        return userRepository.insert(obj);
    }
    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
