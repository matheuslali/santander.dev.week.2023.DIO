package me.dio.santander.dev.week3.service.impl;

import me.dio.santander.dev.week3.domain.model.User;
import me.dio.santander.dev.week3.domain.repository.UserRepository;
import me.dio.santander.dev.week3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository repository;

    public UserServiceImpl (UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && repository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This user ID already exist");
        }
        return repository.save(userToCreate);
    }
}
