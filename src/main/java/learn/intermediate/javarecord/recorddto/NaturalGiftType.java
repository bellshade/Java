package learn.intermediate.javarecord.recorddto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record NaturalGiftType(

	@JsonProperty("name")
	String name,

	@JsonProperty("url")
	String url
) {
}