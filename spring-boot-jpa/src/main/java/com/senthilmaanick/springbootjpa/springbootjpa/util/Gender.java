package com.senthilmaanick.springbootjpa.springbootjpa.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;

public enum Gender {

    @JsonProperty("Male")
    M ("Male"),

    @JsonProperty("Female")
    F ("Female"),

    @JsonProperty("Unknown")
    U ("Unknown");

    private String fullName;

    Gender(String fullName) {
        this.fullName = fullName;
    }
}
