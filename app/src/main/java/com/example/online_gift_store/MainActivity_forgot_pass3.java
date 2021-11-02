package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity_forgot_pass3 extends AppCompatActivity {
    Button chpass;
    EditText pass,cpass;
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_forgot_pass3);
        chpass = (Button)findViewById(R.id.back_login);
        pass = findViewById(R.id.pass);
        cpass=findViewById(R.id.cpass);
        id = getIntent().getStringExtra("id");

        chpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pass.getText().toString().length() == 0  ) {
                    pass.requestFocus();
                    pass.setError("Please Enter New Password");
                } else if (pass.getText().toString().length() < 8) {
                    pass.requestFocus();
                    pass.setError("Password must be 8 charactor.");
                } else if (!cpass.getText().toString().equals(pass.getText().toString())) {
                    cpass.requestFocus();
                    cpass.setError("Password not matched.");
                }
                else {
                /*    FirebaseFirestore.getInstance().collection("Registration").document(id).update("pass", pass.getText().toString());*/
                    Intent intent = new Intent(MainActivity_forgot_pass3.this, MainActivity_login.class);
                    Toast.makeText(getApplicationContext(), "Password Changed Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}