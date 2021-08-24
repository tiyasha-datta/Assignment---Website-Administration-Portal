package com.websiteadmin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usergroup")

public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "groupId")
    private Long userGroupId;
    private String groupName;
    private String groupType;
    private String groupDescription;
    private String groupEmail;

    @OneToMany(mappedBy = "usergroup",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<User> users = new HashSet<>();

    public UserGroup() {
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public UserGroup(Long userGroupId, String groupName, String groupType, String groupDescription, String groupEmail) {
        this.userGroupId = userGroupId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.groupDescription = groupDescription;
        this.groupEmail = groupEmail;
    }

    public Long getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
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
}
