package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_forgot_pass2 extends AppCompatActivity {
    Button gchngpass;
    String otp;
    int success = 1;
    EditText enterotp;
    String getques,cno,tmp;
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_forgot_pass2);
        getques = getIntent().getStringExtra("question");
        cno = getIntent().getStringExtra("number");

        enterotp = findViewById(R.id.otp);
        gchngpass = (Button)findViewById(R.id.gtcp);
          gchngpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterotp.getText().toString().length()==0)
                {
                    enterotp.requestFocus();
                    enterotp.setError("Please Enter OTP");
                }
                else {
                /*    FirebaseFirestore.getInstance().collection("Registration").addSnapshotListener(new EventListener<QuerySnapshot>() {
                        @Override
                        public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                            for (DocumentSnapshot s : value) {
                                if (quest.getText().toString().equals(s.getString("question"))) {
                                    String trial = s.getString("question");
                                    String trialanwer = s.getString("ans");


                                    if (trialanwer.equals(answer.getText().toString())) {
                                        success = 1;
                                        id = s.getId();
                                    }

                                }
                            }
                        }

                    }); */

                    if (success == 1) {
                        Intent intent = new Intent(MainActivity_forgot_pass2.this, MainActivity_forgot_pass3.class);
                    //    intent.putExtra("id", id);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity_forgot_pass2.this, "Invalid OTP..!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}