package com.revature.pokedeck.deck;

import com.revature.pokedeck.deck.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {

    //boolean existsByUsername(String username);

    Optional<Deck> findDeckBydeckName(String deckName);
}
