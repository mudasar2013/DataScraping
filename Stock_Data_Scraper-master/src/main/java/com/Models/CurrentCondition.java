/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author umard
 */
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class CurrentCondition {

    private String observation_time;
    private String temp_C;
    private String temp_F;
    private String weatherCode;
    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl> iconUrl;
    private List<WeatherDesc> weatherDesc;
    private String windspeedMiles;
    private String windspeedKmph;
    private String winddirDegree;
    private String winddir16Point;
    private String precipMM;
    private String precipInches;
    private String humidity;
    private String visibility;
    private String visibilityMiles;
    private String pressure;
    private String pressureInches;
    private String cloudcover;
    @JsonProperty("FeelsLikeC")
    private String feelslikeC;
    @JsonProperty("FeelsLikeF")
    private String feelslikeF;
    private String uvIndex;
}
