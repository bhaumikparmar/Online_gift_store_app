
package com.example.online_gift_store.ui.rate;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.online_gift_store.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class RateFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RateViewModel rateViewModel = new ViewModelProvider(this).get(RateViewModel.class);
        View root = inflater.inflate(R.layout.fragment_rate, container, false);

        RatingBar rt = root.findViewById(R.id.ratingBar);
        LayerDrawable stars=(LayerDrawable)rt.getProgressDrawable();

        EditText ratemail = root.findViewById(R.id.ratemail);
        TextView textView = root.findViewById(R.id.rate);
        TextView t = root.findViewById(R.id.textrate);


        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

        Button button = root.findViewById(R.id.send);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ratemail.getText().toString().length() == 0) {
                    ratemail.requestFocus();
                    ratemail.setError("Please Enter Email Id.");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(ratemail.getText().toString()).matches()) {
                    ratemail.setError("Enter valid Email id.");
                }
                else {
                    String rating = String.valueOf(rt.getRating());

                    t.setText(String.valueOf(rt.getRating()));

                    Map<String, String> values = new HashMap<>();
                    values.put("email", ratemail.getText().toString());
                    values.put("rate", t.getText().toString());

                    FirebaseFirestore.getInstance().collection("Rating").add(values).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<DocumentReference> task) {

                            Toast.makeText(getContext(), rating, Toast.LENGTH_LONG).show();

                        }

                    });
                }
            }
        });
        rateViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }


}
