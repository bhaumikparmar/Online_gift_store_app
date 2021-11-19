package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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


public class MainActivity_payment extends AppCompatActivity {
    Button payment;
    EditText email,nameoncard, nooncard,date,cvvno;
    ImageView pback;
    TextView id,order_date, p_name, p_qty, p_price, total_amount;
    String Or_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_payment);

        email = findViewById(R.id.textEmail);
        nameoncard = findViewById(R.id.textName);
        nooncard = findViewById(R.id.TextNumber);
        date = findViewById(R.id.TextDate);
        cvvno = findViewById(R.id.cvv);

        id = findViewById(R.id.order_no);
        order_date = findViewById(R.id.order_date);
        p_name = findViewById(R.id.p_name);
        p_qty = findViewById(R.id.p_qty);
        p_price = findViewById(R.id.p_price);
        total_amount = findViewById(R.id.total_amount);

        String d5 = getIntent().getStringExtra("value5");
        String d6 = getIntent().getStringExtra("value6");
        String d7 = getIntent().getStringExtra("value7");
        String d8 = getIntent().getStringExtra("value8");
        String d9 = getIntent().getStringExtra("value9");
        String d10 = getIntent().getStringExtra("value10");

        id.setText(d5);
        order_date.setText(d6);
        p_name.setText(d7);
        p_qty.setText(d8);
        p_price.setText(d9);
        total_amount.setText(d10);



        pback = findViewById(R.id.pback);
        pback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity_payment.this,MainActivity_delivery_info.class);
                startActivity(intent);
            }
        });

        payment = (Button)findViewById(R.id.pay);
        payment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (email.getText().toString().length() == 0) {
                    email.requestFocus();
                    email.setError("Please Enter Email Id.");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
                    email.setError("Enter valid Email id.");
                }
                if (nameoncard.getText().toString().length() == 0) {
                    nameoncard.requestFocus();
                    nameoncard.setError("Please Enter Your Name.");
                } else if (!nameoncard.getText().toString().matches("[a-zA-Z ]+")) {
                    nameoncard.requestFocus();
                    nameoncard.setError("Enter Only Alphabetical Character");
                } else if (nooncard.getText().toString().length() == 0) {
                    nooncard.requestFocus();
                    nooncard.setError("Please Enter Debit Card Number.");
                } else if (!nooncard.getText().toString().matches("^[0-9]{16}$")) {
                    nooncard.requestFocus();
                    nooncard.setError("Enter Valid Debit Card number.");
                } else if (date.getText().toString().length() == 0) {
                    date.requestFocus();
                    date.setError("Please Enter Card Expire Date.");
                } else if (!date.getText().toString().matches("^[01-12]{2}/[0-9]{2}")) {
                    date.requestFocus();
                    date.setError("Enter Valid Card Expire Date.");
                } else if (cvvno.getText().toString().length() == 0) {
                    cvvno.requestFocus();
                    cvvno.setError("Please Enter CVV Number");
                } else if (!cvvno.getText().toString().matches("^[0-9]{3}$")) {
                    cvvno.requestFocus();
                    cvvno.setError("Enter Valid CVV Number.");
                } else {
                    Map<String, String> values = new HashMap<>();
                    values.put("email", email.getText().toString());
                    values.put("name on card", nameoncard.getText().toString());
                    values.put("number on card", nooncard.getText().toString());
                    values.put("expire date", date.getText().toString());
                    values.put("cvv number", cvvno.getText().toString());

                    FirebaseFirestore.getInstance().collection("Payment").add(values).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<DocumentReference> task) {
                        }
                    });


                    Intent intent = new Intent(MainActivity_payment.this, MainActivity_receipt.class);
                    intent.putExtra("or_id",Or_id);
                    intent.putExtra("value11", d5);
                    intent.putExtra("value12", d6);
                    intent.putExtra("value13", d7);
                    intent.putExtra("value14", d8);
                    intent.putExtra("value15", d9);
                    intent.putExtra("value16", d10);
                    Toast.makeText(getApplicationContext(), "Placed Order And Payment Successful. ", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });

    }
}