package com.example.helloworldmanyata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //click button to change text
        findViewById(R.id.textcolor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.design_default_color_error));
            }
        });

        //click button to change background
        findViewById(R.id.backcolor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                findViewById(R.id.layout).setBackgroundColor(getResources().getColor(R.color.design_default_color_secondary));
            }
        });
    }
}