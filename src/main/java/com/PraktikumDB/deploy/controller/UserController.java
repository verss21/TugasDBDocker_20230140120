package com.PraktikumDB.deploy.controller;


import com.PraktikumDB.deploy.model.User;
import com.PraktikumDB.deploy.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public String create(@RequestBody User request) {
        return "User created successfully";
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("{id}/")
    public String deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return"User deleted successfully";
    }


