package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity_order_info extends AppCompatActivity{
    TextView text1,text2,text3,text4,text5,text6;
    ImageView iimage;
    Button b1;
    Spinner s1;
    String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
    String s,total_price;
    double price=0.0,total=0.0,qty=0.0;
    int resid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_info);

        text1 = findViewById(R.id.iname);
        text2 = findViewById(R.id.pricetext1);
        text4 = findViewById(R.id.currency);
        text3 = findViewById(R.id.total);
        text5 = findViewById(R.id.total_cu);
        text6 = findViewById(R.id.current_date);
        s1 =(Spinner)findViewById(R.id.spinner);

        iimage = findViewById(R.id.iimage);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            resid = bundle.getInt("resId");
            iimage.setImageResource(resid);
        }


        String nm = getIntent().getStringExtra("value");
        String rs = getIntent().getStringExtra("value2");

        text1.setText(nm);
        text2.setText(rs);
        text6.setText(date);

        price = Double.parseDouble(text2.getText().toString());

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.qty, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s = parent.getItemAtPosition(position).toString();
                qty = Double.parseDouble(s);
                total = price * qty  ;
                total_price = Double.toString(total);
                text3.setText(total_price);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        b1 = findViewById(R.id.continue1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity_order_info.this,MainActivity_delivery_info.class);
                intent.putExtra("value0",text6.getText().toString());
                intent.putExtra("value1",text1.getText().toString());
                intent.putExtra("value2",s);
                intent.putExtra("value3",text4.getText().toString() + text2.getText().toString());
                intent.putExtra("value4",text5.getText().toString() + text3.getText().toString());
                startActivity(intent);
            }
        });

    }
}