package com.revature.pokedeck.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Comparable<User>{

    @Id
    @Column(name = "userid", nullable = false, unique = true)
    private Integer userId;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "pw", nullable = false)
    private String password;

    @Column(name = "roleid", nullable = false)
    private Integer roleId;

    public User(Integer userid, String email, String username, String password, Integer roleId) {
        this.userId = userid;
        this.email = email;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                '}';
    }

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userid) {
        this.userId = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public int compareTo(User o) {
        if (this == o) return 0;
        if (getUserid() != 0) {
            return getUsername().compareTo(o.getUsername());
        } else {
            return -1;
        }
    }
}
