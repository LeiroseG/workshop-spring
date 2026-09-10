package com.leirose.course.services;

import com.leirose.course.entities.User;
import com.leirose.course.repositories.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
       Optional<User> obj =  repository.findById(id);
       return obj.get();
    }
}
