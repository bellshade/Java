package learn.intermediate.javahttpclient.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import learn.intermediate.javahttpclient.dto.PokemonDetailResponse;
import learn.intermediate.javarecord.recorddto.PokemonRecordResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestClientServiceImpl implements RestClientService {

    private static final Logger log = Logger.getLogger(RestClientServiceImpl.class.getName());
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public RestClientServiceImpl(HttpClient httpClient, ObjectMapper objectMapper) {
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    /**
     * get data pokemon berdasarkan id
     * @param id ini merupakan id dari data pokemon
     * @return sebuah record {@link PokemonDetailResponse} object class berisi detail info pokemon
     */
    @Override
    public PokemonDetailResponse getDetailPokemon(String id) {
        log.info( "get detail pokemon by id "+id);
        try {
            //create request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://pokeapi.co/api/v2/berry/"+id))
                    .build();
            //send request to server
            HttpResponse<String> stringHttpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            //convert string to dto
            return objectMapper.readValue(stringHttpResponse.body(), PokemonDetailResponse.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            log.log(Level.SEVERE, "there is an error  ");
            throw new RuntimeException();
        }

    }

    /**
     * get data pokemon berdasarkan id
     * @param id ini merupakan id dari data pokemon
     * @return sebuah record {@link PokemonRecordResponse} object record berisi detail info pokemon
     */
    @Override
    public PokemonRecordResponse getDetailRecord(String id) {
        log.info( "get detail pokemon with record by id "+id);
        try {
            //create request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://pokeapi.co/api/v2/berry/"+id))
                    .build();
            //send request to server
            HttpResponse<String> stringHttpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            //convert string to dto
            return objectMapper.readValue(stringHttpResponse.body(), PokemonRecordResponse.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            log.log(Level.SEVERE, "there is an error  ");
            throw new RuntimeException();
        }
    }
}
