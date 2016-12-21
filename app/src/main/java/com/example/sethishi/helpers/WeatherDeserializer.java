package com.example.sethishi.helpers;

import com.example.sethishi.models.WeatherVo;
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
