package com.revature.pokedeck.user;

import com.revature.pokedeck.deck.DeckService;
import com.revature.pokedeck.deck.dtos.DeckResponse;
import com.revature.pokedeck.user.dtos.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/decks")
public class DeckController {

    private final DeckService deckService;

    @Autowired
    public DeckController(DeckService deckService) {
        this.deckService = deckService;
    }

    @GetMapping(produces = "application/json")
    public List<DeckResponse> getAllDecks() {
        return deckService.fetchAllDecks();
    }
}
