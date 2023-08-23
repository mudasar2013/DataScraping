/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@lombok.Data
@Getter
@Setter
public class WeatherInfo {

    @JsonProperty("data")
    private Data data;

    public String toString() {
        return data.getWeather().get(0).getMinTempC() + " "
                + data.getWeather().get(0).getMinTempF() + " "
                + data.getWeather().get(0).getMaxTempC() + " "
                + data.getWeather().get(0).getMaxTempF() + " "
                + data.getCurrentConditions().get(0).getVisibility() + " "
                + data.getWeather().get(0).getAstronomys().get(0).getSunrise() + " "
                + data.getWeather().get(0).getAstronomys().get(0).getSunset() + " "
                + data.getWeather().get(0).getAstronomys().get(0).getMoonrise() + " "
                + data.getWeather().get(0).getAstronomys().get(0).getMoonset();
    }
}
