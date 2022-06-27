package com.revature.pokedeck.users.dtos;

import com.revature.pokedeck.users.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {

    private String userId;
    private String email;
    private String username;
    private String role;

    public UserResponse(User user) {
        this.userId = user.getUserId();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.role = user.getRole().toString();
    }
}
