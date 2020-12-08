package com.example.searchformovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    final static String TAG = MainActivity.class.getSimpleName();
    final static String KEY ="message_key";
    private TextView tvbatman;
    private TextView tvdevil;
    private TextView tvmutanti;
    private TextView tvxxx;


  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvbatman=findViewById(R.id.textbatman);
        tvdevil=findViewById(R.id.textdevil);
        tvmutanti=findViewById(R.id.textmutanti);
        tvxxx=findViewById(R.id.textxxx);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);




        tvbatman=findViewById(R.id.textbatman);
        tvdevil=findViewById(R.id.textdevil);
        tvmutanti=findViewById(R.id.textmutanti);
        tvxxx=findViewById(R.id.textxxx);
    }

    public void buttonbatman(View view) {

        tvbatman.setTextColor(Color.GREEN);
        Intent batman= new Intent(this, BatmanActivity.class);
        startActivity(batman);
    }



    public void buttondevil(View view) {
        tvdevil.setTextColor(Color.GREEN);
        Intent devil=new Intent(this, DevilActivity.class);
        startActivity(devil);

    }

    public void buttonmutanti(View view) {
        tvmutanti.setTextColor(Color.GREEN);
        Intent mutanti =new Intent(this, MutantiActivity.class);
        startActivity(mutanti);
    }

    public void buttonxxx(View view) {
        tvxxx.setTextColor(Color.GREEN);
        Intent xxx= new Intent(this, MutantiActivity.class);
        startActivity(xxx);

    }*/
}