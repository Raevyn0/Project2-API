package com.revature.pokedeck.fav_card;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userfavoritecards")
public class FavCard {

    @OneToMany
}
