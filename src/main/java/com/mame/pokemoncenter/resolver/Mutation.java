package com.mame.pokemoncenter.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mame.pokemoncenter.domain.Pokemon;
import com.mame.pokemoncenter.domain.PokemonInput;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    //adding pokemon to database or sth else
    public Pokemon addPokemon(PokemonInput pokemonInput) {
        return pokemonInput.toPokemon();
    }
}
