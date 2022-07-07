package com.revature.pokedeck.user.dtos;

import com.revature.pokedeck.card.Card;
import com.revature.pokedeck.deck.DeckCard;
import com.revature.pokedeck.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class UserResponse {

    private Integer userId;
    private String email;
    private String username;

    private String password;
    private Integer role;

    private List<String> favoriteCardsId;

    public UserResponse(User user) {
        this.userId = user.getUserId();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.getRoleId();
        this.favoriteCardsId = user.getFavoriteCards().stream().map(Card::getCardid).collect(Collectors.toList());
    }
}