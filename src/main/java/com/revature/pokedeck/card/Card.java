package com.revature.pokedeck.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
public class Card  implements Comparable <Card>{

    @Id
    @Column
    private String cardid;

    @Column
    private String cardurl;

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
