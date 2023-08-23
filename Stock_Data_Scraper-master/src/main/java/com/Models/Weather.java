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
public class Weather {

    private String date;
    @JsonProperty("astronomy")
    private List<Astronomy> astronomys;
    @JsonProperty("maxtempC")
    private String maxTempC;
    @JsonProperty("maxtempF")
    private String maxTempF;
    @JsonProperty("mintempC")
    private String minTempC;
    @JsonProperty("mintempF")
    private String minTempF;
    @JsonProperty("avgtempC")
    private String avgTempC;
    @JsonProperty("avgtempF")
    private String avgTempF;
    @JsonProperty("totalSnow_cm")
    private String totalSnow;
    @JsonProperty("sunHour")
    private String sunHour;
    @JsonProperty("uvIndex")
    private String uvIndex;
    @JsonProperty("hourly")
    private List<Hour> hours;

}
