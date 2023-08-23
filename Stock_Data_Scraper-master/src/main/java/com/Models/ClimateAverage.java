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
public class ClimateAverage {

    @JsonProperty("month")
    private List<Month> month;
}
