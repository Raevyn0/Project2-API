package com.revature.pokedeck.card;

import com.revature.pokedeck.card.dtos.CardResponse;
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
    public List<CardResponse> fetchAllCards() {
        return null;
    }
}
