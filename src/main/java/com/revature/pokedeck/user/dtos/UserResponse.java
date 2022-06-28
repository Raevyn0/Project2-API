package com.revature.pokedeck.user.dtos;

import com.revature.pokedeck.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {

    private Integer userId;
    private String email;
    private String username;
    private Integer role;

    public UserResponse(User user) {
        this.userId = user.getUserid();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.role = user.getRoleId();
    }
}