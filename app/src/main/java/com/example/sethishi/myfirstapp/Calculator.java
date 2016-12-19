package com.example.sethishi.myfirstapp;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private int value;
    String  sum= "SUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void calculateValue(View view){

        TextView txtData1;
        TextView txtData2;

        txtData1 = (TextView) findViewById(R.id.num1);
        txtData2 = (TextView) findViewById(R.id.num2);

        int num1 = Integer.parseInt(txtData1.getText().toString());
        int num2 = Integer.parseInt(txtData2.getText().toString());


        radioGroup = (RadioGroup) findViewById(R.id.rg1);
        int selected = radioGroup.getCheckedRadioButtonId();

        radioButton = (RadioButton) findViewById(selected);

        switch(radioButton.getId()) {
            case R.id.radioButton:

                value = sum(num1,num2);

                break;
            case R.id.radioButton3:
                value= multiply(num1,num2);
                break;

            case R.id.radioButton2:
                value= subtract(num1,num2);
                break;
        }

//        TextView textView = new TextView(this);
//        textView.setTextSize(40);
//        textView.setText(value);


        TextView textView1 = (TextView) findViewById(R.id.finalValue);
        textView1.setText(Integer.toString(value));

//        ViewGroup layout = (ViewGroup) findViewById(R.id.finalValue);
//        layout.addView(textView);



    }


    private int sum(int a , int b)
    {
        return a+b;
    }
    private int multiply(int a,int b){
        return a*b;
    }
    private int subtract(int a ,int b){
        return a-b;
    }

}
