package learn.intermediate.javahttpclient.services;

import learn.intermediate.javahttpclient.dto.PokemonDetailResponse;

public interface RestClientService {

    PokemonDetailResponse getDetailPokemon(String id);
}
