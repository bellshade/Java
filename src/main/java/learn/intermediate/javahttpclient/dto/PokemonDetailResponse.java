package learn.intermediate.javahttpclient.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * ini merupakan class DTO untuk response detail pokemon
 * disini tidak menggunakan getter dan setter karna telah menggunakan anotasi @Data dari Lombok
 */
@Data
public class PokemonDetailResponse {

	private List<FlavorsItem> flavors;
	@JsonProperty("natural_gift_type")
	private NaturalGiftType naturalGiftType;
	private Item item;
	private int smoothness;
	private int size;
	@JsonProperty("natural_gift_power")
	private int naturalGiftPower;
	private Firmness firmness;
	private String name;
	@JsonProperty("growth_time")
	private int growthTime;
	@JsonProperty("soil_dryness")
	private int soilDryness;
	private int id;
	@JsonProperty("max_harvest")
	private int maxHarvest;
}