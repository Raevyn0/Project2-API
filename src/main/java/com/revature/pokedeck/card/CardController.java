package com.revature.pokedeck.card;

import com.revature.pokedeck.card.dtos.CardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cards")
public class CardController {

    private final CardService cardservice;

    @Autowired
    public CardController(CardService cardService) {
        this.cardservice = cardService;
    }

    @GetMapping(produces = "application/json")
    public List<CardResponse> getAllCards () {
        return cardservice.fetchAllCards();
    }


}
