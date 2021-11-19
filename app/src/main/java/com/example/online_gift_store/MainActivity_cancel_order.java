package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity_cancel_order extends AppCompatActivity {

    String Or_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cancel_order);

        Or_id = getIntent().getStringExtra("or_id");

        ImageView b1 = findViewById(R.id.can_yes);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseFirestore.getInstance().collection("Order").document(Or_id).delete();
                Intent intent = new Intent(MainActivity_cancel_order.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "Order Cancel... ", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        ImageView b2 = findViewById(R.id.can_no);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cancel_order.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}