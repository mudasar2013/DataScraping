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
@Getter
@Setter
public class Astronomy {

    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    @JsonProperty("moon_phase")
    private String moonPhase;
    @JsonProperty("moon_illumination")
    private String moonIllumination;
}
