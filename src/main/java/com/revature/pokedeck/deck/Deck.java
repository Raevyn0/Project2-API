package com.revature.pokedeck.deck;
import com.revature.pokedeck.user.User;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "deck")
public class Deck implements Comparable<Deck> {

    @Id
    @Column(name = "id")
    private Integer deckId;

    @Column(name = "name")
    private String deckName;

    @Column(name = "owner_id")
    private Integer ownerId;

    @OneToMany(mappedBy = "deck")
    Set<DeckCard> cards;

    public Deck() {
    }

    public Set<DeckCard> getCards() {
        return cards;
    }

    public void setCards(Set<DeckCard> cards) {
        this.cards = cards;
    }

    public Deck(Integer deckId, String deckName, Integer ownerId, Set<DeckCard> cards) {
        this.deckId = deckId;
        this.deckName = deckName;
        this.ownerId = ownerId;
        this.cards = cards;
    }

    public int getDeckId() {
        return deckId;
    }

    public void setDeckId(int deckId) {
        this.deckId = deckId;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckId=" + deckId +
                ", deckName='" + deckName + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }

    @Override
    public int compareTo(Deck o) {
        if (this == o) return 0;
        if (getDeckId() != 0) {
            return getDeckName().compareTo(o.getDeckName());
        } else {
            return -1;
        }
    }
}


//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "decks")
//public class Deck {
//
//    @Id
//    private int id;
//
//    @Column(nullable = false)
//    private String name;
//
//    @JoinColumn(name = "creator_id")
//    private User creator;
//
//    @OneToMany(mappedBy = "deckId")
//
//   private List<DeckCard> cards;
//}
