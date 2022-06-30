package com.revature.pokedeck.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
<<<<<<< HEAD
import java.util.Objects;

@Entity
@Table(name = "card")
public class Card  implements Comparable <Card>{

    @Id
    @Column( name = "cardid", nullable = false)
    private String Cardid;

    @Column(name = "cardurl", nullable = false)
    private String Cardurl;

    public Card( String cardid, String cardurl) {
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
=======

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
>>>>>>> c21d27c85154d093230cdf164ee62fa733f3d677
    }

    @Override
    public String toString() {
        return "Card{" +
<<<<<<< HEAD
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

=======
                "cardid='" + cardid + '\'' +
                ", cardurl='" + cardurl + '\'' +
                '}';
    }

>>>>>>> c21d27c85154d093230cdf164ee62fa733f3d677
    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
