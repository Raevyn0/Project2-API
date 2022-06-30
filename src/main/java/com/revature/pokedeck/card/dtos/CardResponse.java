package com.revature.pokedeck.card.dtos;

import com.revature.pokedeck.card.Card;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardResponse {

    private String Cardid;

    private String Cardurl;

    public CardResponse(Card card) {
        this.Cardid = card.getCardid();
        this.Cardurl = card.getCardurl();
    }
}
