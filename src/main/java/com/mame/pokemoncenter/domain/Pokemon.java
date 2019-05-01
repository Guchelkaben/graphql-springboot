package com.mame.pokemoncenter.domain;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private PokemonType pokemonType;
}
