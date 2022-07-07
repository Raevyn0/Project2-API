package com.revature.pokedeck.card;

import com.revature.pokedeck.card.dtos.CardResponse;
import com.revature.pokedeck.deck.DeckRepository;
import com.revature.pokedeck.deck.dtos.DeckResponse;
import com.revature.pokedeck.util.exceptions.ResourceNotFoundException;
import com.revature.pokedeck.user.dtos.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CardService {

    private final CardRepository cardRepo;

    @Autowired
    public CardService(CardRepository cardRepo) {
        this.cardRepo = cardRepo;
    }

    public List<CardResponse> fetchAllCards() {
        return cardRepo.findAll()
                .stream()
                .map(CardResponse::new)
                .collect(Collectors.toList());
    }
}
