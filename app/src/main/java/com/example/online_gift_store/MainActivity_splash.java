package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_splash extends AppCompatActivity {

    ImageView  image;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        image = findViewById(R.id.main_image);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity_splash.this, MainActivity_users.class);
                startActivity(intent);
                finish();
            }
        },1500);


    }

}