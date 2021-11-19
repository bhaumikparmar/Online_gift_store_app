package com.example.online_gift_store.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.online_gift_store.MainActivity_anniversary_gift;
import com.example.online_gift_store.MainActivity_birthday_gift;
import com.example.online_gift_store.MainActivity_cakes;
import com.example.online_gift_store.MainActivity_combo_gift;
import com.example.online_gift_store.MainActivity_flowers;
import com.example.online_gift_store.MainActivity_occasions_gift;
import com.example.online_gift_store.R;


public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        TextView textView = root.findViewById(R.id.text_home);

        ImageView imageView = root.findViewById(R.id.i1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity_birthday_gift.class);
                startActivity(intent);
            }
         });


        ImageView imageView1 = root.findViewById(R.id.i2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity_anniversary_gift.class);
                startActivity(intent);
            }
         });

        ImageView imageView2 = root.findViewById(R.id.i3);


        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity_occasions_gift.class);
                startActivity(intent);
            }
          });

        ImageView imageView3 = root.findViewById(R.id.i4);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity_cakes.class);
                startActivity(intent);
            }
          });

        ImageView imageView4 = root.findViewById(R.id.i5);


        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity_flowers.class);
                startActivity(intent);
            }
          });

        ImageView imageView5 = root.findViewById(R.id.i6);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), MainActivity_combo_gift.class);
                startActivity(intent);
            }
          });

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}