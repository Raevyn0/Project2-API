package com.revature.pokedeck.user;

import com.revature.pokedeck.common.util.exceptions.ResourceNotFoundException;
import com.revature.pokedeck.user.dtos.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserResponse> fetchAllUsers() {
        return userRepo.findAll()
                        .stream()
                        .map(UserResponse::new)
                        .collect(Collectors.toList());
    }

    public UserResponse fetchUserById(Integer userid) {
        return userRepo.findById(userid)
                .map(UserResponse::new)
                .orElseThrow(ResourceNotFoundException::new);
    }

}
