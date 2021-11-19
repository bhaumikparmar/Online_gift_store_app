package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MainActivity_delivery_info extends AppCompatActivity {
    Button sub;
    EditText add,pincode;
    TextView order_no,order_date, p_name, p_qty, p_price, total_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_delivery_info);

        final Random myRandom = new Random();
        add = findViewById(R.id.address);
        pincode = findViewById(R.id.pincode);


        order_no = findViewById(R.id.order_no);
        order_date = findViewById(R.id.order_date);
        p_name = findViewById(R.id.p_name);
        p_qty = findViewById(R.id.p_qty);
        p_price = findViewById(R.id.p_price);
        total_amount = findViewById(R.id.total_amount);


        String d0 = getIntent().getStringExtra("value0");
        String d1 = getIntent().getStringExtra("value1");
        String d2 = getIntent().getStringExtra("value2");
        String d3 = getIntent().getStringExtra("value3");
        String d4 = getIntent().getStringExtra("value4");

        order_date.setText(d0);
        p_name.setText(d1);
        p_qty.setText(d2);
        p_price.setText(d3);
        total_amount.setText(d4);

        sub = (Button)findViewById(R.id.submitinfo);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                order_no.setText(String.valueOf(myRandom.nextInt(1000)));;


                if (add.getText().toString().length() == 0) {
                    add.requestFocus();
                    add.setError("Please Enter Address.");
                }

                else if (pincode.getText().toString().length() == 0){
                    pincode.requestFocus();
                    pincode.setError("Please Enter Pincode.");
                }
                else if (pincode.getText().toString().length() > 6 | pincode.getText().toString().length() < 6) {
                    pincode.requestFocus();
                    pincode.setError("Pincode Must Be 6 Digit.");
                }

                else {
                    Map<String, String> values = new HashMap<>();
                    values.put("order_no", order_no.getText().toString());
                    values.put("order_date", order_date.getText().toString());
                    values.put("product_name", p_name.getText().toString());
                    values.put("product_quantity",p_qty.getText().toString());
                    values.put("product_price",p_price.getText().toString());
                    values.put("Total_price",total_amount.getText().toString());
                    values.put("address", add.getText().toString());
                    values.put("pincode", pincode.getText().toString());


                    FirebaseFirestore.getInstance().collection("Order").add(values).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<DocumentReference> task) {
                        }
                    });

                Intent intent = new Intent(MainActivity_delivery_info.this, MainActivity_payment.class);
                intent.putExtra("value5", order_no.getText().toString());
                intent.putExtra("value6",order_date.getText().toString());
                intent.putExtra("value7",p_name.getText().toString());
                intent.putExtra("value8",p_qty.getText().toString());
                intent.putExtra("value9",p_price.getText().toString());
                intent.putExtra("value10",total_amount.getText().toString());
                Toast.makeText(getApplicationContext(), "Information Submitted Successful. ", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                }
            }

        });
    }
}