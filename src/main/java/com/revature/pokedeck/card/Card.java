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
    private String Cardid;

    @Column(name = "cardurl", nullable = false)
    private String Cardurl;

    public Card(String cardid, String cardurl) {
        Cardid = cardid;
        Cardurl = cardurl;
    }

    public Card() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(Cardid, card.Cardid) && Objects.equals(Cardurl, card.Cardurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cardid, Cardurl);
    }

    public String getCardid() {
        return Cardid;
    }

    public void setCardid(String cardid) {
    }

    public String getCardurl() {
        return Cardurl;
    }

    public void setCardurl(String cardurl) {
        Cardurl = cardurl;
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }

}