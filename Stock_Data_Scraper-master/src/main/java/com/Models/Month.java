/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author umard
 */
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class Month {

    private String index;
    private String name;
    private String avgMinTemp;
    private String avgMinTemp_F;
    private String absMaxTemp;
    private String absMaxTemp_F;
    private String avgDailyRainfall;
}
