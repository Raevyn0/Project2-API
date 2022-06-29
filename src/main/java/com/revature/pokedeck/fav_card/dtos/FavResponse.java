package com.revature.pokedeck.fav_card.dtos;

import com.revature.pokedeck.fav_card.FavCard;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FavResponse {

    private Integer userid;

    private String cardid;

    public FavResponse (FavCard favCard) {
        this.userid = favCard.getUserid();
        this.cardid = favCard.getCardid();
    }
}
