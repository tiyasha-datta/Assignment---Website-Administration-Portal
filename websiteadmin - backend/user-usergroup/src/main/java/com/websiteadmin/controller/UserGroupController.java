package com.websiteadmin.controller;

import com.websiteadmin.dao.UserGroupDao;
import com.websiteadmin.entities.UserGroup;
import com.websiteadmin.services.UserGroupService;
import com.websiteadmin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usergroup")
public class UserGroupController {

    @Autowired
    private UserGroupDao userGroupDao;

    @Autowired
    private UserGroupService userGroupService;

    @PostMapping("/")
    public ResponseEntity<?> addUserGroup(@RequestBody UserGroup userGroup){
        UserGroup userGroup1 = this.userGroupService.addUserGroup(userGroup);
        return ResponseEntity.ok(userGroup1);
    }

    @GetMapping("/")
    public Set<UserGroup> getUserGroups(){
        return this.userGroupService.viewUserGroups();
    }

    @GetMapping("/{userGroupId}")
    public UserGroup getSingleUserGroup(@PathVariable Long userGroupId){
        return this.userGroupService.viewSingleUserGroup(userGroupId);
    }

    @PutMapping("/")
    public UserGroup updateUserGroup(@RequestBody UserGroup userGroup){
        return this.userGroupService.updateUserGroup(userGroup);
    }

    @DeleteMapping("/{userGroupId}")
    public void deleteUserGroup(@PathVariable Long userGroupId){
         this.userGroupService.deleteUserGroup(userGroupId);
    }

}
