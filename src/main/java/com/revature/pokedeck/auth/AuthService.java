package com.revature.pokedeck.auth;


import com.revature.pokedeck.util.exceptions.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.pokedeck.auth.dtos.AuthRequest;
import com.revature.pokedeck.auth.dtos.AuthResponse;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;

@Service
@Transactional
public class AuthService {

    private final AuthRepository authRepo;

    @Autowired
    public AuthService(AuthRepository authRepo) {
        this.authRepo = authRepo;
    }

    public AuthResponse authenticateUserCred(@Valid AuthRequest authRequest) {
        return authRepo.findUserByUsernameAndPassword(authRequest.getUsername(), authRequest.getPassword())
                .map(AuthResponse::new)
                .orElseThrow(AuthenticationException::new);
    }
}
