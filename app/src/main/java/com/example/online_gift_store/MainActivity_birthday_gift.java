package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_birthday_gift extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_gift);

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift1);
                intent.putExtra("value","Chocolaty Tom and Jerry - 1 Kg \n"+
                        "1000rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Fondant\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift2);
                intent.putExtra("value","Chocolate Photo Cake - 1 Kg\n"+
                        "1500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Cream\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Cake Shape - Round");
                startActivity(intent);
            }
        });


        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift3);
                intent.putExtra("value","Lazy Bro Cake - 1 Kg\n"+
                        "650rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Cake Flavour - Chocolate\n"+
                        "-> Type Of Cake - Fondant\n"+
                        "-> Weight - 1 Kg\n"+
                        "-> Cake Shape - Square");
                startActivity(intent);
            }
        });


        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift4);
                intent.putExtra("value","Dairy Milk Bouquet\n"+
                        "500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 10 Dairy Milk Chocolates (13gms each)\n"+
                        "-> Blue and Red paper packing");
                startActivity(intent);
            }
        });


        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift5);
                intent.putExtra("value","Mixed Chocolate Bouquet\n"+
                        "600rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 5-Star Chocolates (22.4 gms each)\n"+
                        "-> 4 Kitkat Chocolates (13.2 gms each)\n"+
                        "-> 3 Dairy Milk Chocolates (13.2 gms each)\n"+
                        "-> Blue and White paper packing");
                startActivity(intent);
            }
        });


        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift6);
                intent.putExtra("value","Love Hamper\n"+
                        "1100rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 12 Red Roses\n"+
                        "-> Paper Packing\n"+
                        "-> Half Kg Black Forest Cake\n"+
                        "-> Teddy bear (6 Inch)");
                startActivity(intent);
            }
        });


        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift7);
                intent.putExtra("value","Red Roses Chocolate Combo\n"+
                        "500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 8 Red Roses\n"+
                        "-> 5 dairy Milk Chocolates (13.2 gms)");
                startActivity(intent);
            }
        });


        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift8);
                intent.putExtra("value","Golden Flower Bracelet\n"+
                        "300rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Floral Gold Bracelet");
                startActivity(intent);
            }
        });


        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift9);
                intent.putExtra("value","Silver Jhumkas\n"+
                        "250rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                       "-> Silver Designer Earrings");
                startActivity(intent);
            }
        });


        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift10);
                intent.putExtra("value","Axe Signature Perfume\n"+
                                "600rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Axe Signature Perfume for men\n"+
                        "-> Quantity - 122 ml");
                startActivity(intent);
            }
        });

        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift11);
                intent.putExtra("value","Blue Lady Perfume\n"+
                        "1800rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> Blue Lady Perfume 40 ml\n"+
                        "-> Spray 200 ml for Women");
                startActivity(intent);
            }
        });


        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift12);
                intent.putExtra("value","Magic Mug\n"+
                        "300rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 Magic Mug (350 ml)");
                startActivity(intent);
            }
        });

        i13 = findViewById(R.id.imageView13);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift13);
                intent.putExtra("value","Magic Mug\n"+
                        "300rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 1 Magic Mug (350 ml)");
                startActivity(intent);
            }
        });

        i14 = findViewById(R.id.imageView14);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_birthday_gift.this,MainActivity1.class);
                Button button = findViewById(R.id.order);
                intent.putExtra("resId",R.drawable.b_gift14);
                intent.putExtra("value","Classic Choco Teddy\n"+
                        "500rs.");
                intent.putExtra("value1", "Product Details:-\n\n"+
                        "-> 12 Inches Teddy Bear \n"+
                        "-> 5 Dairy Milk Chocolates (13.2 gms)");
                startActivity(intent);
            }
        });

    }

}

