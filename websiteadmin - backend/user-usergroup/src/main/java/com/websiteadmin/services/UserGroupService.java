package com.websiteadmin.services;

import com.websiteadmin.entities.UserGroup;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserGroupService {

    public UserGroup addUserGroup(UserGroup userGroup);
    public UserGroup updateUserGroup(UserGroup userGroup);
    public void deleteUserGroup(Long userGroupId);
    public Set<UserGroup> viewUserGroups();
    public UserGroup viewSingleUserGroup(Long userGroupId);
}
