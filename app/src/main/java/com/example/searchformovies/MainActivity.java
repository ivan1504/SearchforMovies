package com.example.searchformovies;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView batman=findViewById(R.id.textbatman);
    TextView devil=findViewById(R.id.textdevil);
    TextView mutanti=findViewById(R.id.textmutanti);
    TextView xxx=findViewById(R.id.textxxx);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonbatman(View view) {
        batman.setTextColor(Color.GRAY);
    }
}