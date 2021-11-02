package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity_forgot_pass1 extends AppCompatActivity {
    Button log;
    EditText user;
    String match,ques;
    int success = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_forgot_pass1);
        user = findViewById(R.id.user);
        log = (Button)findViewById(R.id.ser_but);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().length()==0)
                {
                    user.requestFocus();
                    user.setError("Please Enter Email Id");
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(user.getText().toString()).matches()) {
                    user.requestFocus();
                    user.setError("Enter valid Email Id.");
                }
                else {
                        if (success == 1) {
                            Intent intent = new Intent(MainActivity_forgot_pass1.this, MainActivity_forgot_pass2.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(MainActivity_forgot_pass1.this, "User Not Found...!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}