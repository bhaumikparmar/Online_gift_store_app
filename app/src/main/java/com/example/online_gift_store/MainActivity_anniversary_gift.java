package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_anniversary_gift extends AppCompatActivity {

    ImageView aback,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anniversary_gift);

        aback = findViewById(R.id.aback);
        aback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity_anniversary_gift.this,MainActivity.class);
                startActivity(intent);
            }
        });

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                intent.putExtra("resId",R.drawable.a_gift1);
                intent.putExtra("value","Love Theme Greeting Card \n");
                intent.putExtra("value2","150");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Love Theme Greeting Card");
                startActivity(intent);
            }
        });


        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift2);
                intent.putExtra("value","Chocolate Gift Box - Multi Layered\n");
                intent.putExtra("value2","2000");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 20 Dairy Milks\n"+
                        "-> Multi Layered Box");
                startActivity(intent);
            }
        });


        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift3);
                intent.putExtra("value","Love Duel\n");
                intent.putExtra("value2","650");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 6 Red Roses wrapped in a Red paper and a Red bow\n"+
                        "-> 1 Teddy Bear (6 Inches)");
                startActivity(intent);
            }
        });


        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift4);
                intent.putExtra("value","Pink Beauty Bouquet\n");
                intent.putExtra("value2","300");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 8 Pink Roses");
                startActivity(intent);
            }
        });


        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift5);
                intent.putExtra("value","Heart Shaped Red Velvet Cake - 1 Kg\n");
                intent.putExtra("value2","1800");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Red Velvet\n"+
                        "-> Shape - Heart Shape\n"+
                        "-> Type of Cake - Fondant\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Candles & Knife Included");
                startActivity(intent);
            }
        });


        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift6);
                intent.putExtra("value","Anniversary Photo Cake - 1 Kg\n");
                intent.putExtra("value2",       "1100");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Pineapple\n"+
                        "-> Shape - Square Shape\n"+
                        "-> Type of Cake - Photo Cake\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Candles & Knife Included");
                startActivity(intent);
            }
        });


        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift7);
                intent.putExtra("value","Grandparents Photo Cake - Half Kg \n");
                intent.putExtra("value2",       "500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Butterscotch\n"+
                        "-> Shape - Round Shape\n"+
                        "-> Type of Cake - Photo Cake\n"+
                        "-> Weight - Half Kg\n"+
                        "-> Candles & Knife Included");
                startActivity(intent);
            }
        });


        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift8);
                intent.putExtra("value","Romantic Heart Photo Cushion\n");
                intent.putExtra("value2",        "300");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 Printed Cushion \n"+
                        "-> Cushion Size (12 x 12 inches)");
                startActivity(intent);
            }
        });


        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift9);
                intent.putExtra("value","Rain Of Roses Mug\n");
                intent.putExtra("value2",        "300");
                intent.putExtra("value1", "Product Details:-\n\n"+
                       "-> 1 Printed Ceramic Mug (350 ml)");
                startActivity(intent);
            }
        });


        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift10);
                intent.putExtra("value","Heart of Chocolates\n");
                intent.putExtra("value2","1900");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Heart-Shaped 16 pcs Ferrero Rocher Chocolate Bouquet");
                startActivity(intent);
            }
        });

        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift11);
                intent.putExtra("value","Simple Silly\n");
                intent.putExtra("value2",       "1000");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 Red Roses\n"+
                        "-> 1 Teddy Bear (18inches)");
                startActivity(intent);
            }
        });


        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_anniversary_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.a_gift12);
                intent.putExtra("value","Photo Frame\n");
                intent.putExtra("value2",        "400");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Photo Frame with a Lovely Message\n"+
                        "-> Frame Dimensions: 9.5 x 14 inches\n" +
                        "-> Hardboard material with PVC sheet");
                startActivity(intent);
            }
        });

    }

}

