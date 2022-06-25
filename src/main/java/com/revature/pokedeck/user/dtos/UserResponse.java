package com.revature.pokedeck.user.dtos;

import com.revature.pokedeck.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {

    private Integer userid;
    private String email;
    private String username;
    private Integer roleid;

    public UserResponse(User user) {
        this.userid = user.getId();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.roleid = user.getRoleid();
    }
}
