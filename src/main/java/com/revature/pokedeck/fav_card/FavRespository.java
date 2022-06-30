package com.revature.pokedeck.fav_card;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavRespository extends JpaRepository<FavCard, Integer> {

    List<FavCard> findCardByCardId(String cardid);
}
