package com.websiteadmin.services;

import com.websiteadmin.entities.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);
    public Set<User> viewUsers();
    public User viewSingleUser(Long userId);
}
