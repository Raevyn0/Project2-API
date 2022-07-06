package com.revature.pokedeck.deck;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DeckCardKey implements Serializable {

    @Column(name = "deckid")
    private Integer deckId;

    @Column(name = "cardid")
    private String cardId;

    public DeckCardKey() {
    }

    public DeckCardKey(Integer deckId, String cardId) {
        this.deckId = deckId;
        this.cardId = cardId;
    }

    public Integer getDeckId() {
        return deckId;
    }

    public void setDeckId(Integer deckId) {
        this.deckId = deckId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "DeckCardKey{" +
                "deckId=" + deckId +
                ", cardId='" + cardId + '\'' +
                '}';
    }


}
