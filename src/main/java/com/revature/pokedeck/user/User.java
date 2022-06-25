package com.revature.pokedeck.user;

import java.util.Objects;
import java.util.UUID;

public class User implements Comparable{

    private Integer userid;
    private String email;
    private String username;
    private String pw;
    private Integer roleid;

    public User() {
        super();
        //this.UUID.randomUUID();
    }

    public User(Integer userid) {
        this.userid = userid;
    }

    public User(String email, String username, String pw, Integer roleid) {
        this();
        this.email = email;
        this.username = username;
        this.pw = pw;
        this.roleid = roleid;
    }

    public User(Integer userid, String email, String username, String pw, Integer roleid) {
        this(email, username, pw, roleid);
        this.userid = userid;
        this.roleid = roleid;
    }

    public Integer getId() {
        return userid;
    }

    public void setId(Integer userid) {
        this.userid = userid;
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

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userid == user.userid && roleid == user.roleid && Objects.equals(email, user.email) && Objects.equals(username, user.username) && Objects.equals(pw, user.pw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, email, username, pw, roleid);
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", pw='" + pw + '\'' +
                ", roleid=" + roleid +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) return 1;
        User user = (User) o;
        if (getId() != null) {
            return getId().compareTo(user.getId());
        } else {
            return -1;
        }
    }
}
