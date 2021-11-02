package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;

import android.util.Patterns;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;


public class MainActivity_registration extends AppCompatActivity {
    Button reg,log;
    EditText mail,cno,pass,c_pass,add,pincode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registration);

        mail = findViewById(R.id.mail);
        cno = findViewById(R.id.cno);
        pass = findViewById(R.id.pass);
        c_pass = findViewById(R.id.c_pass);
        add = findViewById(R.id.address);
        pincode = findViewById(R.id.pincode);

        reg = (Button)findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            /*    if (mail.getText().toString().length() == 0) {
                    mail.requestFocus();
                    mail.setError("Can't Be Empty");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(mail.getText().toString()).matches()) {
                    mail.setError("Enter valid Email id.");
                }
                else if (cno.getText().toString().length() == 0) {
                    cno.requestFocus();
                    cno.setError("Can't Be Empty");
                } else if (!Patterns.PHONE.matcher(cno.getText().toString()).matches()) {
                    cno.requestFocus();
                    cno.setError("Enter valid contact number.");
                } else if (pass.getText().toString().length() == 0  ) {
                    pass.requestFocus();
                    pass.setError("Can't Be Empty");
                } else if (pass.getText().toString().length() < 6) {
                    pass.requestFocus();
                    pass.setError("Password must be 6 charactor.");
                } else if (!c_pass.getText().toString().equals(pass.getText().toString())) {
                    c_pass.requestFocus();
                    c_pass.setError("Password not matched.");
                }
                else { */
                Intent intent = new Intent(MainActivity_registration.this, MainActivity_login.class);
                Toast.makeText(getApplicationContext(), "Registration Successful ", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                //    }
            }
        });
        log = (Button)findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_registration.this,MainActivity_login.class);
                startActivity(intent);
            }
        });
    }
}