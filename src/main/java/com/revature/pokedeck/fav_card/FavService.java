package com.revature.pokedeck.fav_card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FavService {

    private final FavRespository favRepo;

    @Autowired
    public FavService(FavRespository favRepo) {
        this.favRepo = favRepo;
    }
}
