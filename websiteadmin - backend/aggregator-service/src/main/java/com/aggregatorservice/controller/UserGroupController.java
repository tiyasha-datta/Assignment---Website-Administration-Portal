package com.aggregatorservice.controller;

import com.aggregatorservice.entities.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RestController
@RequestMapping("/aggregator")
public class UserGroupController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userGroupId}")
    public UserGroup getSingleUserGroup(@PathVariable Long userGroupId){

        UserGroup userGroup;
        userGroup = this.restTemplate.getForObject("http://webadmin-user-group/usergroup/" + userGroupId,UserGroup.class);
        Set users = this.restTemplate.getForObject("http://webadmin-user/user/usergroup/" + userGroupId,Set.class);
        userGroup.setUsers(users);
        return userGroup;
    }
}
