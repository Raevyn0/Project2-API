package com.revature.pokedeck.deck;

import com.revature.pokedeck.deck.dtos.DeckResponse;
import com.revature.pokedeck.util.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeckService {

    private final DeckRepository deckRepo;

    @Autowired
    public DeckService(DeckRepository deckRepo) {
        this.deckRepo = deckRepo;
    }

    public List<DeckResponse> fetchAllDecks() {
        return deckRepo.findAll()
                .stream()
                .map(DeckResponse::new)
                .collect(Collectors.toList());
    }

    public DeckResponse fetchDeckById(Integer deckId) {
        return deckRepo.findById(deckId)
                .map(DeckResponse::new)
                .orElseThrow(ResourceNotFoundException::new);
    }

}
