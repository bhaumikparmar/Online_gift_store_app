package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_combo_gift extends AppCompatActivity {

    ImageView coback,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo);

        coback = findViewById(R.id.coback);
        coback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity_combo_gift.this,MainActivity.class);
                startActivity(intent);
            }
        });

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c1);
                intent.putExtra("value","Combo Gift For Mother \n");
                intent.putExtra("value2",        "600");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 Multicolo Neckpiece\n" +
                        "-> 1 Printed Ceramic Mug");
                startActivity(intent);
            }
        });


        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c2);
                intent.putExtra("value","Best Dad Gift Combo\n");
                intent.putExtra("value2",        "500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Personalised Heart Shape Table Top for DAD\n" +
                        "-> One 6 inches Greeting Card For DAD");
                startActivity(intent);
            }
        });


        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c3);
                intent.putExtra("value","Amazing Love Combo\n");
                intent.putExtra("value2",       "700");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Printed Quote Red Handle Ceramic Coffee Mug (350 ml)\n" +
                        "-> 1 Photo Frame (6.75 x 4.75 inches)");
                startActivity(intent);
            }
        });


        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c4);
                intent.putExtra("value","Carnations Love Combo\n");
                intent.putExtra("value2",        "1800");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 20 Red Carnations\n" +
                        "-> Paper Packing\n" +
                        "-> Half Kg Chocolate Cake\n" +
                        "-> Teddy ( 12 inches)");
                startActivity(intent);
            }
        });


        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c5);
                intent.putExtra("value","Bright Chocolate Combo\n");
                intent.putExtra("value2",        "1100");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 15 Yellow Roses\n" +
                        "-> 1/2 Kg Chocolate Cake");
                startActivity(intent);
            }
        });


        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c6);
                intent.putExtra("value","Ferrero Rocher Chocolate with Red Roses\n");
                intent.putExtra("value2",        "600");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 6 Red Roses\n" +
                        "-> 4 Ferrero Rocher Chocolates\n" +
                        "-> Red Paper Packing");
                startActivity(intent);
            }
        });


        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c7);
                intent.putExtra("value","Lovely Blooms Combo\n");
                intent.putExtra("value2",        "2500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Heart Shaped Arrangement of 40 Red Roses\n" +
                        "-> 1 kg Heart Shape Black Forest Cake");
                startActivity(intent);
            }
        });


        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c8);
                intent.putExtra("value","3D Mug Combo\n");
                intent.putExtra("value2",       "999");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Love Couple 3D Ceramic Mug with 5 Kitkat Chocolate (13gm)");
                startActivity(intent);
            }
        });


        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c9);
                intent.putExtra("value","Fascinating Silk N Bracelet Combo\n");
                intent.putExtra("value2",        "400");
                intent.putExtra("value1", "Product Details:-\n\n"+
                       "-> Diamond Embedded Gold Bracelet\n" +
                       "-> Dairy Milk Silk Chocolate");
                startActivity(intent);
            }
        });


        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c10);
                intent.putExtra("value","Duo Silk N Ethenic Earrings Combo\n");
                intent.putExtra("value2",               "500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Gold Multicolor Traditional Earrings\n" +
                        "-> 2 Dairy Milk Silk Chocolate");
                startActivity(intent);
            }
        });

        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c11);
                intent.putExtra("value","Frame N Cushion Combo\n");
                intent.putExtra("value2",        "1200");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Personalised Frame\n" +
                        "-> Frame Dimensions: 9.5 x 14 inches\n" +
                        "-> One Personalised Cushion\n" +
                        "-> Cushion size (12 x 12 inches)\n" +
                        "-> Hardboard material with PVC sheet");
                startActivity(intent);
            }
        });


        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_combo_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.c12);
                intent.putExtra("value","KitKat Panda Combo\n");
                intent.putExtra("value2",        "1300");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Panda Teddy (6 inches)\n" +
                        "-> 10 Kitkat Chocolate (37 gm)\n" +
                        "-> One MFT Black Cube Signature Box");
                startActivity(intent);
            }
        });

    }

}

