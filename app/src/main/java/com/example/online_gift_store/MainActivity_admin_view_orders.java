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

public class MainActivity_admin_view_orders extends AppCompatActivity {
    Button b1;
    ImageView orback;
    ListView orderslist;
    List<String> namelist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_orders);
        b1 = findViewById(R.id.orderdata);
        orderslist = findViewById(R.id.orderslist);

        orback = findViewById(R.id.orback);
        orback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity_admin_view_orders.this,MainActivity_view_admin.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseFirestore.getInstance().collection("Order").addSnapshotListener(new EventListener<QuerySnapshot>() {

                    @Override
                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                        namelist.clear();
                        namelist.add("Order no. /-----/" + "Order date /-----/" + "Product name /-----/" + "Product qty /-----/" +
                                "Product price /-----/" + "Total price /-----/" + "Address /-----/" + "Pincode");
                        for (DocumentSnapshot s:value)
                        {
                            namelist.add(s.getString("order_no") + "/-----/" + s.getString("order_date") + "/-----/" +
                                    s.getString("product_name") + "/-----/" + s.getString("product_quantity") + "/-----/" +
                                    s.getString("product_price") + "/-----/" + s.getString("Total_price") + "/-----/" +
                                    s.getString("address") + "/-----/" + s.getString("pincode"));

                        }
                        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity_admin_view_orders.this, android.R.layout.simple_selectable_list_item,namelist);
                        adapter.notifyDataSetChanged();
                        orderslist.setAdapter(adapter);
                    }
                });
            }
        });
    }
}
