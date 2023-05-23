package learn.intermediate.javarecord.recorddto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FlavorsItem(

	@JsonProperty("flavor")
	Flavor flavor,

	@JsonProperty("potency")
	int potency
) {
}