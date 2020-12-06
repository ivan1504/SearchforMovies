package com.example.searchformovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Devil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devil);
    }

    public void intendev(View view) {

        String textMessage = "Our message";
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
        sendIntent.setType("text/plain");

        String title = getResources().getString(R.string.chooser_title);

        Intent chooser = Intent.createChooser(sendIntent, title);


        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }
    }
}