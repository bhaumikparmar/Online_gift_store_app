package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;


public class MainActivity_login_admin extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    TextView forgotpasswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_admin);
        e1 = findViewById(R.id.admin_log);
        e2 = findViewById(R.id.admin_pass);
        b1 = findViewById(R.id.a_login);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().length()==0)
                {
                    e1.requestFocus();
                    e1.setError("Please Enter Email Id");
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(e1.getText().toString()).matches()) {
                    e1.requestFocus();
                    e1.setError("Enter valid email id.");
                }
                else if(e2.getText().toString().length()==0)
                {
                    e2.requestFocus();
                    e2.setError("Please Enter Password");
                }
                else if (e2.getText().length() < 8) {
                    e2.requestFocus();
                    e2.setError("Password must be 8 charactor.");
                }
                else {
                      FirebaseFirestore.getInstance().collection("Admin").addSnapshotListener(new EventListener<QuerySnapshot>() {
                        @Override
                        public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                            for (DocumentSnapshot s : value) {
                                String user = s.getString("username");
                                String pass = s.getString("password");
                                if (user.equals(e1.getText().toString()) && pass.equals(e2.getText().toString())) {
                                    Intent intent = new Intent(MainActivity_login_admin.this, MainActivity_view_admin.class);
                                    startActivity(intent);
                                }
                            }
                        }
                    });

                }
            }
        });
        forgotpasswd = findViewById(R.id.adforgotpass);
        forgotpasswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity_login_admin.this,MainActivity_forgot_pass_admin.class);
                startActivity(intent);
            }
        });

    }
}