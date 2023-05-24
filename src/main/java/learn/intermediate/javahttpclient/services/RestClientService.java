package learn.intermediate.javahttpclient.services;

import learn.intermediate.javahttpclient.dto.PokemonDetailResponse;
import learn.intermediate.javarecord.recorddto.PokemonRecordResponse;

public interface RestClientService {

    PokemonDetailResponse getDetailPokemon(String id);

    PokemonRecordResponse getDetailRecord(String id);
}
