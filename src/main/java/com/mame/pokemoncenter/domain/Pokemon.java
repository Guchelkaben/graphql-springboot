package com.mame.pokemoncenter.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Pokemon {

    private String name;

    private PokemonType pokemonType;
}
