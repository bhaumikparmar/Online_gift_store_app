package com.example.online_gift_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity_login extends AppCompatActivity {
    EditText login,passwd;
    Button log;
    TextView forgot_pass,reg;
    String id;
    int success=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        login = (EditText)findViewById(R.id.user_log);
        passwd = (EditText)findViewById(R.id.pass);


        log=(Button)findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().length()==0)
                {
                    login.requestFocus();
                    login.setError("Please Enter Email Id");
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(login.getText().toString()).matches()) {
                    login.requestFocus();
                    login.setError("Enter valid email id.");
                }
                else if(passwd.getText().toString().length()==0)
                {
                    passwd.requestFocus();
                    passwd.setError("Please Enter Password");
                }
                else if (passwd.getText().length() < 8) {
                    passwd.requestFocus();
                    passwd.setError("Password must be 8 charactor.");
                }
                else {

                    if (success == 1) {
                        Intent intent = new Intent(MainActivity_login.this, MainActivity.class);
                        Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity_login.this, "Email Id Or Password Is Wrong..!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

      reg=findViewById(R.id.regi);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity_login.this,MainActivity_registration.class);
                startActivity(intent);
            }
        });
        forgot_pass = findViewById(R.id.forgotpass);
         forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity_login.this,MainActivity_forgot_pass1.class);
                startActivity(intent);
            }
        });
    }
}