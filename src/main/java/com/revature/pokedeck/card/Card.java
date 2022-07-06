package com.revature.pokedeck.card;

import com.revature.pokedeck.deck.DeckCard;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cards")
public class Card  implements Comparable <Card>{

    @Id
    @Column
    private String cardid;

    @Column
    private String cardurl;

    @OneToMany(mappedBy = "card")
    Set<DeckCard> cards;

    public Card(String cardid, String cardurl) {
        this.cardid = cardid;
        this.cardurl = cardurl;
    }

    public Card() {
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardurl() {
        return cardurl;
    }

    public void setCardurl(String cardurl) {
        this.cardurl = cardurl;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardid='" + cardid + '\'' +
                ", cardurl='" + cardurl + '\'' +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
