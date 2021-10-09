package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi, luas;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = findViewById(R.id.input_alas);
        tinggi = findViewById(R.id.input_tinggi);
        luas = findViewById(R.id.output_luas);
        hitung = findViewById(R.id.btn_hitung);

        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String alas1 = alas.getText().toString().trim();
                String tinggi1 = tinggi.getText().toString().trim();
                double a = toDouble(alas1);
                double t = toDouble(tinggi1);
                double luas1 = 0.5 * a * t;
                luas.setText(String.valueOf(luas1));

            }
        });
    }

    private Double toDouble(String value) {
        try {
            return Double.valueOf(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}