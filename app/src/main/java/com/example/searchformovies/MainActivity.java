package com.example.searchformovies;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , View.OnClickListener {

    private TextView tvbatman;
    private TextView tvdevil;
    private TextView tvmutanti;
    private TextView tvxxx;
    private ImageView imagebatman;
    private ImageView imagedevil;
    private ImageView imagemutanti;
    private ImageView imagexxx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        /*NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getHeaderView(0).setBackgroundColor(Color.RED);*/ //смена цвета дравера

        tvbatman = findViewById(R.id.textbatman);
        tvdevil = findViewById(R.id.textdevill);
        tvmutanti = findViewById(R.id.textmutanti);
        tvxxx = findViewById(R.id.textxxx);
        imagebatman=findViewById(R.id.imagebatman);
        imagedevil=findViewById(R.id.imagedevil);
        imagemutanti=findViewById(R.id.imagemutanti);
        imagexxx=findViewById(R.id.imagexxx);

        imagebatman.setOnClickListener(this);
        imagedevil.setOnClickListener(this);
        imagemutanti.setOnClickListener(this);
        imagexxx.setOnClickListener(this);

    }


    public void buttonbatman(View view) {

        tvbatman.setTextColor(Color.GREEN);
        Intent batman = new Intent(this, BatmanActivity.class);
        startActivity(batman);
    }


    public void buttondevil(View view) {
        tvdevil.setTextColor(Color.GREEN);
        Intent devil = new Intent(this, DevilActivity.class);
        startActivity(devil);

    }

    public void buttonmutanti(View view) {
        tvmutanti.setTextColor(Color.GREEN);
        Intent mutanti = new Intent(this, MutantiActivity.class);
        startActivity(mutanti);
    }

    public void buttonxxx(View view) {
        tvxxx.setTextColor(Color.GREEN);
        Intent xxx = new Intent(this, MutantiActivity.class);
        startActivity(xxx);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imagebatman:
                Intent batman = new Intent(this, BatmanActivity.class);
                startActivity(batman);
                break;
            case R.id.imagedevil:
                Intent devil = new Intent(this, DevilActivity.class);
                startActivity(devil);
                break;
            case R.id.imagemutanti:
                Intent mutanti = new Intent(this, MutantiActivity.class);
                startActivity(mutanti);
                break;
            case R.id.imagexxx:
                Intent xxx = new Intent(this, XXXActivity.class);
                startActivity(xxx);
                break;
        }

    }

    public void showAlertDialog(MenuItem item) {
        AlertDialog.Builder bld = new AlertDialog.Builder(this);
        DialogInterface.OnClickListener lst =
                (dialog, which) -> dialog.dismiss();
        bld.setMessage("Вы действительно хотите выйти?");
        bld.setTitle("Останьтесь!");
        bld.setNegativeButton("Нет", lst);
        bld.setNeutralButton("Позже", lst);
        bld.setPositiveButton("Выйти", lst);
        AlertDialog dialog = bld.create();
        dialog.show();
    }

    public void homeNav(MenuItem item) {
        Toast.makeText(this,"Вы на главном экране",Toast.LENGTH_LONG).show();
    }


}


