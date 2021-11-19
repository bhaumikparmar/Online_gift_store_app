package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_admin_view_users extends AppCompatActivity {
    Button b1;
    ImageView userback;
    ListView list;
    List<String> namelist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_users);
        b1 = findViewById(R.id.userdata);
        list = findViewById(R.id.userslist);

        userback = findViewById(R.id.userback);
        userback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity_admin_view_users.this,MainActivity_view_admin.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseFirestore.getInstance().collection("Registration").addSnapshotListener(new EventListener<QuerySnapshot>() {

                    @Override
                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                        namelist.clear();
                        namelist.add("Email /---------------/" + "Contact no. /---------------/" + "Address /---------------/" + "Pincode");
                        for (DocumentSnapshot s:value)
                        {
                            namelist.add(s.getString("mail") + "/---------------/" + s.getString("cno") + "/---------------/" +
                                    s.getString("add") + "/---------------/" + s.getString("pincode"));
                        }
                        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity_admin_view_users.this, android.R.layout.simple_selectable_list_item,namelist);
                        adapter.notifyDataSetChanged();
                        list.setAdapter(adapter);
                    }
                });
            }
        });
    }
}
