package com.example.id4us.activities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.sethishi.myfirstapp.R;


public class MainActivity extends AppCompatActivity {
    public static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static String SELECTED = "com.example.myfirstapp.SELECTED";

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_calculator:
                if (checked) EXTRA_MESSAGE ="Yes was Clicked";
                Intent intent2 = new Intent(this, Calculator.class);
                startActivity(intent2);
                    break;
            case R.id.radio_weather:
                if (checked)
                    if (checked) EXTRA_MESSAGE ="Yes was Clicked";
                Intent intent = new Intent(this, WeatherActivity.class);
                startActivity(intent);
                    break;
        }
    }


    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {

        radioGroup = (RadioGroup) findViewById(R.id.radio);
        int selected = radioGroup.getCheckedRadioButtonId();

        radioButton = (RadioButton) findViewById(selected);


//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//
//        String radioText = radioButton.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        intent.putExtra(SELECTED, radioText);
//
//
//        startActivity(intent);
    }

}
