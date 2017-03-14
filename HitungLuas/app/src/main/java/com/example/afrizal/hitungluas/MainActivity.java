package com.example.afrizal.hitungluas;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private EditText editPanjang, editLebar;
    private Button btnHitug;
    private TextView txtLuas;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi panjang");

        editPanjang = (EditText) findViewById(R.id.edt_panjang);
        editLebar = (EditText) findViewById(R.id.edt_lebar);
        txtLuas = (TextView) findViewById(R.id.txt_luas);
        btnHitug = (Button) findViewById(R.id.btn_hitung);


        btnHitug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = editPanjang.getText().toString().trim();
                String lebar = editLebar.getText().toString().trim();

                try {
                    double p = Double.valueOf(panjang);
                    double l = Double.valueOf(lebar);

                    double luas = p * l;
                    txtLuas.setText("Luas : " + luas);

                } catch (NumberFormatException e) {
                   // Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
                    System.out.println(e.getMessage());
                }


            }
        });


}}
