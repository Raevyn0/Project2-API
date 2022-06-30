package com.revature.pokedeck.fav_card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favorites")
public class FavController {

    private final FavService favService;

    @Autowired
    public FavController(FavService favService) {
        this.favService = favService;
    }
}
