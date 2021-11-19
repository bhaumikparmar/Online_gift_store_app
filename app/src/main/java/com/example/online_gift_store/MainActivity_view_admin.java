package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_view_admin extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view_admin);
        b1 = findViewById(R.id.view_users);
        b2 = findViewById(R.id.view_orders);
        b3 = findViewById(R.id.view_payments);
        b4 = findViewById(R.id.view_contactus_msg);
        b5 = findViewById(R.id.a_logout);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_view_admin.this,MainActivity_admin_view_users.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_view_admin.this,MainActivity_admin_view_orders.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_view_admin.this,MainActivity_admin_view_payments.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_view_admin.this,MainActivity_admin_view_contactus_msg.class);
                startActivity(intent);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_view_admin.this,MainActivity_login_admin.class);
                startActivity(intent);
            }
        });
    }
}
