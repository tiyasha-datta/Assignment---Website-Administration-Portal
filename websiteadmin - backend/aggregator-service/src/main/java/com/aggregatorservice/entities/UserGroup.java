package com.aggregatorservice.entities;

import java.util.HashSet;
import java.util.Set;


public class UserGroup {

    private Long groupId;
    private String groupName;
    private String groupType;
    private String groupDescription;
    private String groupEmail;
    Set<User> users = new HashSet<>();

    public UserGroup(Long groupId, String groupName, String groupType, String groupDescription, String groupEmail, Set<User> users) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.groupDescription = groupDescription;
        this.groupEmail = groupEmail;
        this.users = users;
    }

    public UserGroup() {
    }

    public UserGroup(Long groupId, String groupName, String groupType, String groupDescription, String groupEmail) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.groupDescription = groupDescription;
        this.groupEmail = groupEmail;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getGroupEmail() {
        return groupEmail;
    }

    public void setGroupEmail(String groupEmail) {
        this.groupEmail = groupEmail;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
