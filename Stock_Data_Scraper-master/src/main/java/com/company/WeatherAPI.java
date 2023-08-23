package com.company;

import com.Models.Token;
import com.Models.WeatherInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class WeatherAPI {
public static Token accessToken;

    public static void main(String[] args) throws UnirestException, JsonProcessingException {

        /*HttpResponse<String> response = Unirest.get("http://api.worldweatheronline.com/premium/v1/weather.ashx?Key=4de76501fb9642d398b163857231708&format=json&num_of_days=1&q=Lorton,%20VA&date=2023-08-17")
                //.header("Content-Type", "application/json")
                .asString();
        if(response.getStatus()==200)
        {
            ObjectMapper mapper = new ObjectMapper();
            WeatherInfo weatherinfo = mapper.readValue(response.getBody(),WeatherInfo.class);
            System.out.println(weatherinfo.getData().getCurrentConditions().get(0));


        }
*/
        HttpResponse<String> response = Unirest.get("http://localhost:8080/APIGateway/AuthenticateService")
                //.header("Content-Type", "application/json")
                .asString();
        if(response.getStatus()==200)
        {
            ObjectMapper mapper = new ObjectMapper();
            accessToken = mapper.readValue(response.getBody(), Token.class);
            System.out.println(accessToken);


        }

    }


}
