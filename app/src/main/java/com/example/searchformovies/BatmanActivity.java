package com.example.searchformovies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BatmanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        if (item.getItemId() == R.id.invent) {
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
        return super.onOptionsItemSelected(item);
    }


}
