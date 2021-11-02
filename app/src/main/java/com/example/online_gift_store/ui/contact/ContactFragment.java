
package com.example.online_gift_store.ui.contact;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.online_gift_store.R;


import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ContactFragment extends Fragment {
    private ContactViewModel contactViewModel;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactViewModel =
                new ViewModelProvider(this).get(ContactViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        final TextView textView = root.findViewById(R.id.contact);
        EditText editText1=root.findViewById(R.id.name);
        EditText editText2=root.findViewById(R.id.email);
        EditText editText3=root.findViewById(R.id.phone);
        EditText editText4=root.findViewById(R.id.subject);
        EditText editText5=root.findViewById(R.id.message);
        Button button=root.findViewById(R.id.send);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().length() == 0) {
                    editText1.requestFocus();
                    editText1.setError("Can't Be Empty");
                }
                else if (!editText1.getText().toString().matches("[a-zA-Z ]+")) {
                    editText1.requestFocus();
                    editText1.setError("Enter Only Alphabetical Character");
                }
               else if (editText2.getText().toString().length() == 0) {
                    editText2.requestFocus();
                    editText2.setError("Can't Be Empty");
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(editText2.getText().toString()).matches()) {
                    editText2.setError("Enter valid Email id.");
                }
                else if (editText3.getText().toString().length() == 0) {
                    editText3.requestFocus();
                    editText3.setError("Can't Be Empty");
                }
                else if (!Patterns.PHONE.matcher(editText3.getText().toString()).matches()) {
                    editText3.requestFocus();
                    editText3.setError("Enter valid contact number.");
                }
                else if (editText4.getText().toString().length() == 0) {
                    editText4.requestFocus();
                    editText4.setError("Can't Be Empty");
                }
                else if (!editText4.getText().toString().matches("[a-zA-Z ]+")) {
                    editText4.requestFocus();
                    editText4.setError("Enter Only Alphabetical Character");
                }
               else if (editText5.getText().toString().length() == 0) {
                    editText5.requestFocus();
                    editText5.setError("Can't Be Empty");
                }
                else if (!editText5.getText().toString().matches("[a-zA-Z ]+")) {
                    editText5.requestFocus();
                    editText5.setError("Enter Only Alphabetical Character");
                }
                else {
                /*    Map<String, String> values = new HashMap<>();
                    values.put("name", editText1.getText().toString());
                    values.put("email", editText2.getText().toString());
                    values.put("cno", editText3.getText().toString());
                    values.put("subject", editText4.getText().toString());
                    values.put("message", editText5.getText().toString());
                    FirebaseFirestore.getInstance().collection("contactus").add(values).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                        @Override
                        public void onComplete(@NonNull @NotNull Task<DocumentReference> task) {
                            Toast.makeText(getContext(), "Your Message Is Submitted..! We will Contact you as soon as Possible...", Toast.LENGTH_SHORT).show();
                        }

                    });
               */ }
            }
        });

        return root;
    }


}
