package com.example.id4us.fragments;


import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.id4us.activities.WeatherActivity;
import com.example.id4us.models.WeatherVo;
import com.example.sethishi.myfirstapp.R;



public class WeatherFragment extends Fragment {

    Layout layout;
    TextView txt;

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.activity_weather, container, false);

//        layout = (Layout) view.findViewWithTag(R.layout.activity_weather);


//        txt=(TextView) view.findViewById(R.id.textView3);
//
//        setText("Test String .....");
        return view;

    }

    public void setText(String text) {
        txt.setText(text);
    }
}
