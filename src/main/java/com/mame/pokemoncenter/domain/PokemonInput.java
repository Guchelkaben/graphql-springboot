package com.mame.pokemoncenter.domain;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonInput {
    private String name;
    private PokemonType pokemonType;

    public Pokemon toPokemon() {
        return Pokemon.builder()
                .name(this.name)
                .pokemonType(this.pokemonType)
                .build();
    }
}
