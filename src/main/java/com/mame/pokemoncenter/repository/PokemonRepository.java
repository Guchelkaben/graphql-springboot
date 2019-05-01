package com.mame.pokemoncenter.repository;

import com.mame.pokemoncenter.domain.Pokemon;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Long> {
}