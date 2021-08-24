package com.websiteadmin.controller;

import com.websiteadmin.dao.UserDao;
import com.websiteadmin.entities.User;
import com.websiteadmin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<?> addUser(@RequestBody User user){
        User user1 =this.userService.addUser(user);
        return ResponseEntity.ok(user1);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @GetMapping("/")
    public Set<User> viewUsers(){
       return this.userService.viewUsers();
    }

    @GetMapping("/{userId}")
    public User viewSingleUser(@PathVariable Long userId){
        return this.userService.viewSingleUser(userId);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
         this.userService.deleteUser(userId);
    }
}
