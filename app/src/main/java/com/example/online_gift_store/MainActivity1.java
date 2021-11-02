package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    TextView t1,pd;
    ImageView i1;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        i1 =findViewById(R.id.gift);
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 != null)
        {
            int resid = bundle1.getInt("resId");
            i1.setImageResource(resid);
        }

        t1 = findViewById(R.id.t1);
        pd = findViewById(R.id.p_details);

        String d = getIntent().getStringExtra("value");
        String d1 = getIntent().getStringExtra("value1");

        t1.setText(d);
        pd.setText(d1);

        b = findViewById(R.id.order);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}