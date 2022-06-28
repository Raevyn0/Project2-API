package com.revature.pokedeck.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card  implements Comparable <Card>{

    @Id
    @Column
    private String Cardid;

    @Column
    private String Cardurl;

    public Card( String cardid, String cardurl) {
        Cardid = cardid;
        Cardurl = cardurl;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return "Card{" +
                "Cardid='" + Cardid + '\'' +
                ", Cardurl='" + Cardurl + '\'' +
                '}';
    }

    public String getCardid() {
        return Cardid;
    }

    public void setCardid(String cardid) {
        Cardid = cardid;
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
