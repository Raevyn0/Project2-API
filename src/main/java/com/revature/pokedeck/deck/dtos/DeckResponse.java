package com.revature.pokedeck.deck.dtos;

import com.revature.pokedeck.card.Card;
import com.revature.pokedeck.deck.Deck;
import com.revature.pokedeck.deck.DeckCard;
import com.revature.pokedeck.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class DeckResponse {

    private Integer deckId;

    private String deckName;

    private Integer ownerId;

    private List<Card> deckCards;

    public DeckResponse(Deck deck){
        this.deckId = deck.getDeckId();
        this.deckName = deck.getDeckName();
        this.ownerId = deck.getOwnerId();
        this.deckCards = deck.getCards().stream().map(DeckCard::getCard).collect(Collectors.toList());
    }

}
