package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class MainActivity1 extends AppCompatActivity {
    TextView t1,t2,t3,pd;
    ImageView i1;
    Button b;
    int resid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        i1 =findViewById(R.id.gift);
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 != null)
        {
            resid = bundle1.getInt("resId");
            i1.setImageResource(resid);
        }

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.currency);
        pd = findViewById(R.id.p_details);

        String d = getIntent().getStringExtra("value");
        String d2 = getIntent().getStringExtra("value2");
        String d1 = getIntent().getStringExtra("value1");

        t1.setText(d);
        t2.setText(d2);
        pd.setText(d1);


        b = findViewById(R.id.order);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> values = new HashMap<>();
                values.put("product_name", t1.getText().toString());
                values.put("product_price", t3.getText().toString() + t2.getText().toString());
                values.put("product_details",pd.getText().toString());

                FirebaseFirestore.getInstance().collection("Product_details").add(values).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<DocumentReference> task) {
                    }
                });
                Intent intent= new Intent(MainActivity1.this,MainActivity_order_info.class);
                intent.putExtra("value",d);
                intent.putExtra("value2",d2);
                intent.putExtra("resId",resid);
                startActivity(intent);
            }
        });
    }
}