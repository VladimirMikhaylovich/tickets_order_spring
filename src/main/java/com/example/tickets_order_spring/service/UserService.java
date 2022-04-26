package com.example.tickets_order_spring.service;



import com.example.tickets_order_spring.models.entity.User;

import java.util.List;

public interface UserService {
    public List<User> showAllUsers();

    public User showUser(int id);

    public User addUser(User user);

    public User updateUser(User user);

    public User setAsDeleted(int id);
}
