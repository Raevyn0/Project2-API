package com.revature.pokedeck.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "card")
public class Card  implements Comparable <Card> {

    @Id
    @Column(name = "cardid", nullable = false)
    private String cardid;

    @Column(name = "cardurl", nullable = false)
    private String cardurl;

    public Card(String cardid, String cardurl) {
        cardid = cardid;
        cardurl = cardurl;
    }

    public Card() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardid, card.cardid) && Objects.equals(cardurl, card.cardurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardid, cardurl);
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
    }

    public String getCardurl() {
        return cardurl;
    }

    public void setCardurl(String cardurl) {
        cardurl = cardurl;
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }

}