package com.example.sethishi.helpers;

import com.example.sethishi.models.Weather;
import com.example.sethishi.models.WeatherVo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sethishi on 21/12/2016.
 */
public class WeatherDeserializerTest {

    @Test
    public void getWeather1() throws Exception {

    String weatherJson = "{\n" +
            "\t\"coord\": {\n" +
            "\t\t\"lon\": -0.13,\n" +
            "\t\t\"lat\": 51.51\n" +
            "\t},\n" +
            "\t\"weather\": [{\n" +
            "\t\t\"id\": 721,\n" +
            "\t\t\"main\": \"Haze\",\n" +
            "\t\t\"description\": \"haze\",\n" +
            "\t\t\"icon\": \"50d\"\n" +
            "\t}],\n" +
            "\t\"base\": \"stations\",\n" +
            "\t\"main\": {\n" +
            "\t\t\"temp\": 5.62,\n" +
            "\t\t\"pressure\": 1020,\n" +
            "\t\t\"humidity\": 75,\n" +
            "\t\t\"temp_min\": 4,\n" +
            "\t\t\"temp_max\": 7\n" +
            "\t},\n" +
            "\t\"visibility\": 10000,\n" +
            "\t\"wind\": {\n" +
            "\t\t\"speed\": 3.6,\n" +
            "\t\t\"deg\": 160\n" +
            "\t},\n" +
            "\t\"clouds\": {\n" +
            "\t\t\"all\": 75\n" +
            "\t},\n" +
            "\t\"dt\": 1482247200,\n" +
            "\t\"sys\": {\n" +
            "\t\t\"type\": 1,\n" +
            "\t\t\"id\": 5091,\n" +
            "\t\t\"message\": 0.045,\n" +
            "\t\t\"country\": \"GB\",\n" +
            "\t\t\"sunrise\": 1482221029,\n" +
            "\t\t\"sunset\": 1482249210\n" +
            "\t},\n" +
            "\t\"id\": 2643743,\n" +
            "\t\"name\": \"London\",\n" +
            "\t\"cod\": 200\n" +
            "}";



        WeatherDeserializer weatherDeserializer = new WeatherDeserializer();
        WeatherVo weatherVo = weatherDeserializer.getWeather1(weatherJson);
        assertEquals("GB", weatherVo.getSys().getCountry());




    }

}