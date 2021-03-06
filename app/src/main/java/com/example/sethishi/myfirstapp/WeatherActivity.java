package com.example.sethishi.myfirstapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sethishi.helpers.WeatherDeserializer;
import com.example.sethishi.models.WeatherVo;

import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class WeatherActivity extends AppCompatActivity {

    JSONObject data = null;
    WeatherVo weatherVo = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        getJSON("London");
    }

    private void getJSON(final String city) {

        new AsyncTask<Void,Void,Void>(){

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

            }

            @Override
            protected Void doInBackground(Void... params) {

                try {

                    URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+"&units=metric&APPID=ea574594b9d36ab688642d5fbeab847e");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    BufferedReader reader =
                            new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder out = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        out.append(line);
                    }

                    WeatherDeserializer w = new WeatherDeserializer();
                    weatherVo  = w.getWeather1(out.toString());
                    System.out.println(weatherVo.getSys().getCountry());

                } catch (Exception e) {

                    System.out.println("Exception "+ e.getMessage());
                    return null;
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void Void) {
                if(weatherVo!=null){

                    TextView textView1 = (TextView) findViewById(R.id.maxTemp);
                    TextView textView2 = (TextView) findViewById(R.id.minTemp);
                    TextView textView3 = (TextView) findViewById(R.id.city);

                   textView1.setText("Today's Max is "+weatherVo.getMain().getTempMax().toString()+" deg");
                    textView2.setText("Today's Max is "+weatherVo.getMain().getTempMax().toString()+" deg");
                    textView3.setText(weatherVo.getName());

                }

            }
        }.execute();

    }
}
