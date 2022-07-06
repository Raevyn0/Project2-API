package com.revature.pokedeck.card.dtos;

import com.revature.pokedeck.card.Card;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardResponse {

    private String cardid;

    private String cardurl;

    public CardResponse(Card card) {
        this.cardid = card.getCardid();
        this.cardurl = card.getCardurl();
    }
}
