package com.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class Token {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private String expiresIn;
    @JsonProperty("scope")
    private String scope;

}
