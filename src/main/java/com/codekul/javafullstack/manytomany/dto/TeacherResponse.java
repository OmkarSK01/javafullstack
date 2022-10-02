package com.codekul.javafullstack.manytomany.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//6june-store procedure call in sprinboot
@JsonPropertyOrder({"id","name","address"})
public interface TeacherResponse {
    @JsonProperty("Id")
    Integer getId();
    String getName();
    String getAddress();
}
