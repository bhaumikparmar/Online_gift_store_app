package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
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


public class MainActivity_registration extends AppCompatActivity {
    Button reg,log;
    TextView countrycode;
    EditText mail,cno,pass,c_pass,add,pincode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registration);

        mail = findViewById(R.id.mail);
        countrycode = findViewById(R.id.contrycode);
        cno = findViewById(R.id.cno);
        pass = findViewById(R.id.pass);
        c_pass = findViewById(R.id.c_pass);
        add = findViewById(R.id.address);
        pincode = findViewById(R.id.pincode);

        reg = (Button)findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mail.getText().toString().length() == 0) {
                    mail.requestFocus();
                    mail.setError("Please Enter Email Id.");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(mail.getText().toString()).matches()) {
                    mail.setError("Enter valid Email id.");
                }

                else if (cno.getText().toString().length() == 0) {
                    cno.requestFocus();
                    cno.setError("Please Enter Contact Number.");
                } else if (!Patterns.PHONE.matcher(cno.getText().toString()).matches()) {
                    cno.requestFocus();
                    cno.setError("Enter Valid Contact Number.");

                } else if (pass.getText().toString().length() == 0  ) {
                    pass.requestFocus();
                    pass.setError("Please Enter Password");
                } else if (pass.getText().toString().length() < 8) {
                    pass.requestFocus();
                    pass.setError("Password Must Be 8 Charactor.");

                } else if (!c_pass.getText().toString().equals(pass.getText().toString())) {
                    c_pass.requestFocus();
                    c_pass.setError("Password Not Matched.");
                }

                else if (add.getText().toString().length() == 0) {
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
                    values.put("mail", mail.getText().toString());
                    values.put("cno", countrycode.getText().toString()+cno.getText().toString());
                    values.put("pass", pass.getText().toString());
                    values.put("add",add.getText().toString());
                    values.put("pincode",pincode.getText().toString());


                    FirebaseFirestore.getInstance().collection("Registration").add(values).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<DocumentReference> task) {
                        }
                    });
                    Intent intent = new Intent(MainActivity_registration.this, MainActivity_login.class);
                    Toast.makeText(getApplicationContext(), "Registration Successful ", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
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