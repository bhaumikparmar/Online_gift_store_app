package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_occasions_gift extends AppCompatActivity {

    ImageView ocback,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occasions_gift);

        ocback = findViewById(R.id.ocback);
        ocback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity_occasions_gift.this,MainActivity.class);
                startActivity(intent);
            }
        });

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift1);
                intent.putExtra("value","Almonds N Pistachios \n");
                intent.putExtra("value2",       "500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Almonds (100 gms) \n"+
                        "-> Pistachios (100 gms)");
                startActivity(intent);
            }
        });


        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift2);
                intent.putExtra("value","Sweets in Silver Thali\n");
                intent.putExtra("value2",        "1900");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 500 Gms Kaju Roll\n" +
                        "-> 500 Gms Besan Ladoo\n" +
                        "-> 1 Silver Thali");
                startActivity(intent);
            }
        });


        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift3);
                intent.putExtra("value","Pamper With Dry Fruits\n");
                intent.putExtra("value2",       "2500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> A Round Glass Vase\n"+
                        "-> Diameter 6 Inches approx.containing Almonds (250 gms),\n"+
                        "-> Raisin (250 gms), Cashews Nuts (250 gms), Pista (250 gms)");
                startActivity(intent);
            }
        });


        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift4);
                intent.putExtra("value","Soan Papdi N Cadbury Celebrations Pack\n");
                intent.putExtra("value2",       "550");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Soan Papdi (250 gms)\n" +
                        "-> 1 Cadbury Celebrations Pack (114 gms)");
                startActivity(intent);
            }
        });


        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift5);
                intent.putExtra("value","Haldirams Kaju Katli\n");
                intent.putExtra("value2",        "600");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 500 Gms Kaju Katli");
                startActivity(intent);
            }
        });


        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift6);
                intent.putExtra("value","Lavishing Holi Wishes\n");
                intent.putExtra("value2",        "800");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 500 gm Haldiram Gujiya");
                startActivity(intent);
            }
        });


        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift7);
                intent.putExtra("value","Rasgulla N Kitkat Chocolates\n");
                intent.putExtra("value2",        "700");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 2 Nestle's Kitkat Chocolates (13.2 gms each)\n" +
                        "-> Rasgulla (1 Kg)");
                startActivity(intent);
            }
        });


        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift8);
                intent.putExtra("value","Gulab Jamun Diyas\n");
                intent.putExtra("value2",        "900");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 kg Haldiram's Gulab Jamun\n" +
                        "-> 5 Wax Filled Diyas(each of 2 inches diameter");
                startActivity(intent);
            }
        });


        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift9);
                intent.putExtra("value","Potli Full of Healthy Dry Fruits\n");
                intent.putExtra("value2",        "600");
                intent.putExtra("value1", "Product Details:-\n\n"+
                       "-> A Potli Bag with a pearl handle\n"+
                       "-> Almonds (100 gms) and Cashew Nuts (100 gms)");
                startActivity(intent);
            }
        });


        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift10);
                intent.putExtra("value","Kesariya Ladoos\n");
                intent.putExtra("value2",               "1200");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 kg Kesariya Motichoor Ladoo");
                startActivity(intent);
            }
        });

        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift11);
                intent.putExtra("value","Congratulations Coffee Mug\n");
                intent.putExtra("value2",        "300");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Printed Congratulations Theme \n Black Handle Ceramic Mug (350ml)");
                startActivity(intent);
            }
        });


        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift12);
                intent.putExtra("value","Dairy Milk Family Rakhi Pack\n");
                intent.putExtra("value2",       "500");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Minion Rakhi\n"+
                        "-> Lumba Rakhi\n"+
                        "-> 2 Dairy Milk Fruit n Nut");
                startActivity(intent);
            }
        });

        i13 = findViewById(R.id.imageView13);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift13);
                intent.putExtra("value","Bro Rakhi with Chocolates\n");
                intent.putExtra("value2",        "200");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Metal Bro Rakhi\n" +
                        "-> 2 Dairy Milk Chocolate (13.2gm)");
                startActivity(intent);
            }
        });

        i14 = findViewById(R.id.imageView14);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_occasions_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.o_gift14);
                intent.putExtra("value","Christmas Blessings\n");
                intent.putExtra("value2",        "700");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> One Decorated Christmas Tree\n" +
                        "-> Merry Christmas Greeting Card");
                startActivity(intent);
            }
        });

    }

}

