package com.revature.pokedeck.user;

import com.revature.pokedeck.card.Card;
import com.revature.pokedeck.deck.DeckCard;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany
    @JoinTable(
            name = "userfavoritecards",
            joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name = "cardid"))
    private List<Card> favoriteCards;

    public User(Integer userId, String email, String username, String password, Integer roleId, List<Card> favoriteCards) {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.favoriteCards = favoriteCards;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", favoriteCards=" + favoriteCards +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public List<Card> getFavoriteCards() {
        return favoriteCards;
    }

    public void setFavoriteCards(List<Card> favoriteCards) {
        this.favoriteCards = favoriteCards;
    }

    @Override
    public int compareTo(User o) {
        if (this == o) return 0;
        if (getUserId() != 0) {
            return getUsername().compareTo(o.getUsername());
        } else {
            return -1;
        }
    }
}
