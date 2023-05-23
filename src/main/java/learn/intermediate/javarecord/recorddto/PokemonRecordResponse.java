package learn.intermediate.javarecord.recorddto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public record PokemonRecordResponse(

	@JsonProperty("flavors")
	List<FlavorsItem> flavors,

	@JsonProperty("natural_gift_type")
	NaturalGiftType naturalGiftType,

	@JsonProperty("item")
	Item item,

	@JsonProperty("smoothness")
	int smoothness,

	@JsonProperty("size")
	int size,

	@JsonProperty("natural_gift_power")
	int naturalGiftPower,

	@JsonProperty("firmness")
	Firmness firmness,

	@JsonProperty("name")
	String name,

	@JsonProperty("growth_time")
	int growthTime,

	@JsonProperty("soil_dryness")
	int soilDryness,

	@JsonProperty("id")
	int id,

	@JsonProperty("max_harvest")
	int maxHarvest
) {
}