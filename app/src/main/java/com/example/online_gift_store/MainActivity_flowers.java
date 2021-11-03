package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_flowers extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occasions_gift);

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f1);
                intent.putExtra("value","100 Red Roses Bouquet \n"+
                        "2500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 100 Red Roses\n" +
                        "-> Paper Packing");
                startActivity(intent);
            }
        });


        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f2);
                intent.putExtra("value","8 Mixed Roses Bouquet\n"+
                        "300rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 8 Mixed Roses Bouquet");
                startActivity(intent);
            }
        });


        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f3);
                intent.putExtra("value","Vibrant Jubilance\n"+
                        "2500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 6 Purple Orchids\n" +
                        "-> Paper Packing");
                startActivity(intent);
            }
        });


        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f4);
                intent.putExtra("value","Assorted Flowers Bouquet\n"+
                        "600rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Bouquet of 12 Assorted Carnations (Yellow,White,Red and Pink) \n" +
                        "-> Jute Packing and Pink Rafia");
                startActivity(intent);
            }
        });


        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f5);
                intent.putExtra("value","Bundle Of Love\n"+
                        "300rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 3 Yellow Roses\n" +
                        "-> 2 White Roses\n" +
                        "-> 2 Red Roses\n" +
                        "-> 3 Orange Roses");
                startActivity(intent);
            }
        });


        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f6);
                intent.putExtra("value","A Dozen Yellow Roses\n"+
                        "400rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 12 Yellow Roses wrapped in cellophane");
                startActivity(intent);
            }
        });


        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f7);
                intent.putExtra("value","Red Infatuation\n"+
                        "700rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Arrangement of 13 Red Roses \n" +
                        "-> Glass Vase with leaves");
                startActivity(intent);
            }
        });


        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f8);
                intent.putExtra("value","Spray Rainbow Roses\n"+
                        "1900rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 15 spray coloured Roses ( Red, White, Yellow, Blue, Golden, Silver, Green and Brown)\n" +
                        "-> Paper Packing");
                startActivity(intent);
            }
        });


        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f9);
                intent.putExtra("value","Best of Flowers\n"+
                        "1200rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                       "-> 4 Blue Orchids\n" +
                       "-> 4 Yellow and Pink Asiatic Lilies\n" +
                       "-> Yellow Paper");
                startActivity(intent);
            }
        });


        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f10);
                intent.putExtra("value","Pink n Yellow Oriental Lilies\n"+
                                "1400rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 4 Oriental Lily (Pink and Yellow)\n" +
                        "-> Paper Packing");
                startActivity(intent);
            }
        });

        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f11);
                intent.putExtra("value","Ardent Romance\n"+
                        "300rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Single Stick of Red Rose in MyFlowerTree Luxury Black Box");
                startActivity(intent);
            }
        });


        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f12);
                intent.putExtra("value","Purple Admiration\n"+
                        "500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 6 Purple Orchids wrapped in Cellophane packing");
                startActivity(intent);
            }
        });

        i13 = findViewById(R.id.imageView13);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f13);
                intent.putExtra("value","Royal Roses\n"+
                        "200rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 10 Blue sprayed Roses\n" +
                        "-> White Paper Packing\n" +
                        "-> Blue Bow");
                startActivity(intent);
            }
        });

        i14 = findViewById(R.id.imageView14);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_flowers.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.f14);
                intent.putExtra("value","Pink Happiness\n"+
                        "2100rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Single Pink Rose Paper Packing Arrangement\n");
                startActivity(intent);
            }
        });

    }

}

