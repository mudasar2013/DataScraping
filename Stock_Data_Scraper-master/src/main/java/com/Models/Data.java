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
public class Data {

    @JsonProperty("request")
    private List<Request> request;
    @JsonProperty("current_condition")
    private List<CurrentCondition> currentConditions;
    @JsonProperty("weather")
    private List<Weather> weather;
    @JsonProperty("ClimateAverages")
    private List<ClimateAverage> climateAverages;

}
