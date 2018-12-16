package com.mame.pokemoncenter.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mame.pokemoncenter.domain.Pokemon;
import com.mame.pokemoncenter.domain.PokemonType;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public Pokemon fetchPokemonByName(String name) {
        return Pokemon.builder()
                .name("Charizard")
                .pokemonType(PokemonType.fire)
                .build();
    }
}
