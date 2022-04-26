package com.example.tickets_order_spring.web;


import com.example.tickets_order_spring.models.entity.User;
import com.example.tickets_order_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUsers(){
        List<User> users  = userService.showAllUsers();
        return users;
    }
    @GetMapping("/users/{id}")
    public User showUser(@PathVariable int id){
        return userService.showUser(id);

    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
      return userService.updateUser(user);
    }

    @PutMapping("/users/{id}")
    public User setDeleted(@PathVariable int id){
        return userService.setAsDeleted(id);
    }
}
