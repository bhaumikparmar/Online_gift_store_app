package com.example.online_gift_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.util.zip.DataFormatException;

public class MainActivity_receipt extends AppCompatActivity{
    Button download,cancel;
    TextView number,dt,nm,qty,pc,tp;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        number = findViewById(R.id.odrNo);
        dt = findViewById(R.id.odrdt);
        nm = findViewById(R.id.pdctNm);
        qty = findViewById(R.id.pdctqty);
        pc= findViewById(R.id.pdctprice);
        tp = findViewById(R.id.totalPrice);


        String o_id = getIntent().getStringExtra("value11");
        String o_date = getIntent().getStringExtra("value12");
        String p_nm = getIntent().getStringExtra("value13");
        String p_q = getIntent().getStringExtra("value14");
        String p_p = getIntent().getStringExtra("value15");
        String t_amt = getIntent().getStringExtra("value16");

        number.setText(o_id);
        dt.setText(o_date);
        nm.setText(p_nm);
        qty.setText(p_q);
        pc.setText(p_p);
        tp.setText(t_amt);


        cancel = findViewById(R.id.cancel1);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseFirestore.getInstance().collection("Order").addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                        for (DocumentSnapshot s : value) {
                            if (number.getText().toString().equals(s.getString("order_no"))) {
                                id = s.getId();
                            }
                        }
                    }
                });
                Intent intent=new Intent(MainActivity_receipt.this, MainActivity_cancel_order.class);
                intent.putExtra("or_id",id);
                startActivity(intent);
            }
        });

        download = findViewById(R.id.download1);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    createPdf();
                }
                catch (FileNotFoundException | DataFormatException e){
                    e.printStackTrace();
                }

            }
        });
    }

    private void createPdf() throws FileNotFoundException, DataFormatException {

        String num = number.getText().toString();
        String date = dt.getText().toString();
        String pname = nm.getText().toString();
        String qnty = qty.getText().toString();
        String price = pc.getText().toString();
        String tprice = tp.getText().toString();

        String pdfPath = "/receipt.pdf";
        PdfWriter writer = new PdfWriter(pdfPath);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);


        float[] columnWidth = {200f, 200f};
        Table table = new Table(columnWidth);
        table.addCell("Order No. :");
        table.addCell(num);

        table.addCell("Order Date :");
        table.addCell(date);
        document.add(new Paragraph(dt.getText().toString()));


        table.addCell("Product Name :");
        table.addCell(pname);
        document.add(new Paragraph(nm.getText().toString()));

        table.addCell("Quantity :");
        table.addCell(qnty);

        table.addCell("Price :");
        table.addCell(price);

        table.addCell("Total Price :");
        table.addCell(tprice);


        document.add(table);
        document.close();
        Toast.makeText(this,"Receipt Downloaded..", Toast.LENGTH_LONG).show();
    }
}