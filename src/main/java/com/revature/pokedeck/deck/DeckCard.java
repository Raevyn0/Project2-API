package com.revature.pokedeck.deck;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "deck_cards")
public class DeckCard {

    private int deckId;
    private String cardId;
    private int quantity;

}
