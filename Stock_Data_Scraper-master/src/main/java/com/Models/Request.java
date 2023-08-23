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
public class Request {

    @JsonProperty("type")
    private String type;
    @JsonProperty("query")
    private String query;
}
