package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    //    Handler handler = new Handler();
    //    int currentTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


            new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent (SplashScreen.this, com.example.tictactoe.MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
 }
}