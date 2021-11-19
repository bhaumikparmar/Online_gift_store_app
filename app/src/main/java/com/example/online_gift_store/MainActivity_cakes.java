package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_cakes extends AppCompatActivity {
    ImageView cback,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        cback = findViewById(R.id.cback);
        cback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity_cakes.this,MainActivity.class);
                startActivity(intent);
            }
        });

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake1);
                intent.putExtra("value","Chocolate Cream Cake - Half Kg\n");
                intent.putExtra("value2",        "649");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake2);
                intent.putExtra("value","Roses & Pearls Chocolate Cake - Half Kg\n");
                intent.putExtra("value2",       "745");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Roses & Pearls\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake3);
                intent.putExtra("value","Vanilla Rainbow Cake - Half Kg\n");
                intent.putExtra("value2",       "650");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Vanilla\n"+
                        "-> Type Of Cake - Vanilla Rainbow\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake4);
                intent.putExtra("value","Tony Tiger Cake - Half Kg\n");
                intent.putExtra("value2",        "500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Normal\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake5);
                intent.putExtra("value","Chocolate Cake - Half Kg\n");
                intent.putExtra("value2",        "550");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake6);
                intent.putExtra("value","Barbie Cake - 1 Kg\n");
                intent.putExtra("value2",        "1000");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate, Vanilla\n"+
                        "-> Type Of Cake - Fondant Cake\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Cake Shape - Barbie");
                startActivity(intent);
            }
        });


        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake7);
                intent.putExtra("value","Chocolate Cake - Half Kg\n");
                intent.putExtra("value2",        "450");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Chocolate\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake8);
                intent.putExtra("value","Chocolate Cake - Half Kg\n");
                intent.putExtra("value2",       "450");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake9);
                intent.putExtra("value","Chocolate Cake - Half Kg\n");
                intent.putExtra("value2",        "300");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake10);
                intent.putExtra("value","Chocolate Cake - Half Kg\n");
                intent.putExtra("value2",               "600");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });

        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake11);
                intent.putExtra("value","Chocolate Cake - 1 Kg\n");
                intent.putExtra("value2",       "750");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_cakes.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.cake12);
                intent.putExtra("value","Elsa Dress Cake - 1 Kg\n");
                intent.putExtra("value2",        "800");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Vanilla\n"+
                        "-> Type Of Cake - Fondant\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Cake Shape - Three Tier");
                startActivity(intent);
            }
        });

    }

}

