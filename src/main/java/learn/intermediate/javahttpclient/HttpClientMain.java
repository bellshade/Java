package learn.intermediate.javahttpclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import learn.intermediate.javahttpclient.dto.PokemonDetailResponse;
import learn.intermediate.javahttpclient.services.RestClientService;
import learn.intermediate.javahttpclient.services.RestClientServiceImpl;
import learn.intermediate.javarecord.recorddto.PokemonRecordResponse;

import java.net.http.HttpClient;
import java.util.logging.Logger;

public class HttpClientMain {

    private static final Logger log = Logger.getLogger(HttpClientMain.class.getName());

    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();

        RestClientService restClientService = new RestClientServiceImpl(httpClient, objectMapper);

        PokemonDetailResponse detailPokemon = restClientService.getDetailPokemon("1");

        PokemonRecordResponse detailRecord = restClientService.getDetailRecord("1");

        log.info(detailPokemon.toString());

        log.info(detailRecord.toString());
    }
}
