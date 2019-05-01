package com.mame.pokemoncenter;

import com.mame.pokemoncenter.domain.Pokemon;
import com.mame.pokemoncenter.domain.PokemonType;
import com.mame.pokemoncenter.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class PokemoncenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(PokemoncenterApplication.class, args);
	}

	@Bean
	public CommandLineRunner fillDb(PokemonRepository pokemonRepository){
		return (args) ->  {
			for (int i = 0; i < 50; i++) {
				pokemonRepository.save(Pokemon.builder()
						.name("Pokemon"+i)
						.pokemonType(PokemonType.values()[new Random().nextInt(3)])
						.build());
			}
		};
	}
}