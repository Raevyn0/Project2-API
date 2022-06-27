package com.revature.pokedeck.config;

import com.revature.pokedeck.users.User;
import com.revature.pokedeck.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.UUID;

@Component
public class MockData implements CommandLineRunner {

    private final UserRepository userRepo;

    @Autowired
    public MockData(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user1 = new User(UUID.randomUUID().toString(), "pokemon@revature.com", "admin", "Password1", User.Role.ADMIN);
        User user2 = new User(UUID.randomUUID().toString(), "testter@revature.com", "tester", "ACoolPassword", User.Role.USER);
        User user3 = new User(UUID.randomUUID().toString(), "ZacharyC@revature.com", "ZacharyC", "ADumbPassword", User.Role.USER);
        userRepo.saveAll(Arrays.asList(user1, user2, user3));

    }
}