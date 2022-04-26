package com.example.tickets_order_spring.service;


import com.example.tickets_order_spring.models.entity.User;
import com.example.tickets_order_spring.repository.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo repository;

    @Override
    public List<User> showAllUsers() {
        return repository.findAll();
    }

    @Override
    public User showUser(int id) {
        User user = null;
        Optional<User> optionalUser = repository.findById(id);
        if(optionalUser.isPresent())
            user = optionalUser.get();
        return user;
    }

    @Override
    public User addUser(User user) {

      return repository.save(user);

    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public User setAsDeleted(int id) {
          User user = repository.getById(id);
        user.setDeleted(true);
        return repository.save(user);
    }
}
