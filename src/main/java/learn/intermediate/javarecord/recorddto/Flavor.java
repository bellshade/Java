package learn.intermediate.javarecord.recorddto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Flavor(

	@JsonProperty("name")
	String name,

	@JsonProperty("url")
	String url
) {
}