package com.websiteadmin.dao;

import com.websiteadmin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
