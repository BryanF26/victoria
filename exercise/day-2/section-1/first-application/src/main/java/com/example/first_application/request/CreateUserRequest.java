package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserRequest {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("age")
    private int age;

    @JsonProperty("gender")
    private String gender;
}
