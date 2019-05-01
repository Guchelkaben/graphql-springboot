package com.mame.pokemoncenter.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mame.pokemoncenter.domain.Pokemon;
import com.mame.pokemoncenter.domain.PokemonType;
import com.mame.pokemoncenter.repository.PokemonRepository;
import com.mame.pokemoncenter.utils.OffsetBasedPageRequest;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private PokemonRepository pokemonRepository;

    public Query(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Pokemon fetchPokemonByName(String name) {
        return Pokemon.builder()
                .name("Charizard")
                .pokemonType(PokemonType.fire)
                .build();
    }

    public Iterable<Pokemon> fetchAllPokemons(Number skip, Number first) {
        return pokemonRepository.findAll(new OffsetBasedPageRequest(skip.intValue(), first.intValue()));
    }
}
