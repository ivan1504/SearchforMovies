package com.example.searchformovies;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvbatman;
    TextView tvdevil;
    TextView tvmutanti;
    TextView tvxxx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvbatman=findViewById(R.id.textbatman);
        tvdevil=findViewById(R.id.textdevil);
        tvmutanti=findViewById(R.id.textmutanti);
        tvxxx=findViewById(R.id.textxxx);
    }

    public void buttonbatman(View view) {

        tvbatman.setTextColor(Color.GREEN);
    }

    public void buttondevil(View view) {
        tvdevil.setTextColor(Color.GREEN);
    }

    public void buttonmutanti(View view) {
        tvmutanti.setTextColor(Color.GREEN);
    }

    public void buttonxxx(View view) {
        tvxxx.setTextColor(Color.GREEN);
    }
}