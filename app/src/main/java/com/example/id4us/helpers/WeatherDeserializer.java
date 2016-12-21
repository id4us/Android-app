package com.example.id4us.helpers;

import com.example.id4us.models.WeatherVo;
import com.google.gson.Gson;

/**
 * Created by sethishi on 21/12/2016.
 */

public class WeatherDeserializer {

       public WeatherVo getWeather1(String weather) {

        Gson gson= new Gson();

        WeatherVo weather1 = gson.fromJson(weather, WeatherVo.class);
        return weather1;


    }

}
