package com.revature.pokedeck.user;

import com.revature.pokedeck.common.dtos.ResourceCreationResponse;
import com.revature.pokedeck.user.dtos.NewUserRequest;
import com.revature.pokedeck.user.dtos.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(produces = "application/json")
    public List<UserResponse> getAllUsers() {
        return userService.fetchAllUsers();
    }

    @GetMapping("/search")
    public List<UserResponse> findBy(@RequestParam Map<String, String> params) {
        return userService.search(params);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResourceCreationResponse postNewUser(@RequestBody NewUserRequest newUserInfo) {
        return userService.createUser(newUserInfo);
    }
}
