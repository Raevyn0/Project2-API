//package com.revature.pokedeck.deck;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "deck_cards")
//public class DeckCard {
//
//    private int deckId;
//    private String cardId;
//    private int quantity;
//
//}

package com.revature.pokedeck.deck;

import com.revature.pokedeck.card.Card;

import javax.persistence.*;

@Entity
@Table(name = "deckcards")
public class DeckCard {

    @EmbeddedId
    DeckCardKey id;

    @ManyToOne
    @MapsId("deckId")
    @JoinColumn(name = "deckid")
    private Deck deck;

    @ManyToOne
    @MapsId("cardId")
    @JoinColumn(name = "cardid")
    private Card card;

    private int quantity;

    public DeckCard() {
    }

    public DeckCard(DeckCardKey id, Deck deck, Card card, int quantity) {
        this.id = id;
        this.deck = deck;
        this.card = card;
        this.quantity = quantity;
    }

    public DeckCardKey getId() {
        return id;
    }

    public void setId(DeckCardKey id) {
        this.id = id;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DeckCard{" +
                "id=" + id +
                ", deck=" + deck +
                ", card=" + card +
                ", quantity=" + quantity +
                '}';
    }
}
