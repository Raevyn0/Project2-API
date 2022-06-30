package com.revature.pokedeck.fav_card;

import com.revature.pokedeck.user.User;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Table(name = "userfavoritecards")
public class FavCard implements Comparable<FavCard>{

    private String userid;
    @OneToMany
    @JoinTable(
            name = "favoritesCard",
            joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name = "userid")
    )
    private List<User> favCards;

    @Id
    @Column(name="cardid", nullable = false)
    private String cardid;

    public FavCard(String userid, String cardid) {
        this.userid = userid;
        this.cardid = cardid;
    }

    public FavCard() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    @Override
    public int compareTo(FavCard o) {
        if (this == o) return 0;
        if (getUserid() != null) {
            return getUserid().compareTo(o.getUserid());
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavCard favCard = (FavCard) o;
        return Objects.equals(userid, favCard.userid) && Objects.equals(cardid, favCard.cardid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, cardid);
    }

    @Override
    public String toString() {
        return "FavCard{" +
                "userid=" + userid +
                ", cardid='" + cardid + '\'' +
                '}';
    }
}
