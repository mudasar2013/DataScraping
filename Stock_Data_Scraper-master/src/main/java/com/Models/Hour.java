/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author umard
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Hour {

    private String time;
    private String tempC;
    private String tempF;
    private String windspeedMiles;
    private String windspeedKmph;
    private String winddirDegree;
    private String winddir16Point;
    private String weatherCode;
    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl> iconUrls;
    private List<WeatherDesc> weatherDesc;
    private String precipMM;
    private String precipInches;
    private String humidity;
    private String visibility;
    private String visibilityMiles;
    private String pressure;
    private String pressureInches;
    private String cloudcover;
    @JsonProperty("HeatIndexC")
    private String HeatC;
    @JsonProperty("HeatIndexF")
    private String HeatF;
    @JsonProperty("DewPointC")
    private String DewC;
    @JsonProperty("DewPointF")
    private String DewF;
    @JsonProperty("WindChillC")
    private String WindC;
    @JsonProperty("WindChillF")
    private String WindF;
    @JsonProperty("WindGustMiles")
    private String WindMiles;
    @JsonProperty("WindGustKmph")
    private String WindKmph;
    @JsonProperty("FeelsLikeC")
    private String FeelslikeC;
    @JsonProperty("FeelsLikeF")
    private String FeelslikeF;
    private String chanceofrain;
    private String chanceofremdry;
    private String chanceofwindy;
    private String chanceofovercast;
    private String chanceofsunshine;
    private String chanceoffrost;
    private String chanceofhightemp;
    private String chanceoffog;
    private String chanceofsnow;
    private String chanceofthunder;
    private String uvIndex;

}
