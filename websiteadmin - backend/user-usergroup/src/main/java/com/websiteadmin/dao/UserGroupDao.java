package com.websiteadmin.dao;

import com.websiteadmin.entities.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupDao extends JpaRepository<UserGroup,Long> {
}
