package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.activities.Ambulancia;
import com.example.myapplication.activities.InicioReportero;

public class MainActivity extends AppCompatActivity {

    Button btnInicioReportero;

    Button btnInicioAmbulancia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        btnInicioReportero = (Button)findViewById(R.id.btnRerportero);

        btnInicioAmbulancia = (Button)findViewById(R.id.btnAmbulancia);

        btnInicioReportero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, InicioReportero.class);
                startActivity(intent);
            }
        });

        btnInicioAmbulancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, Ambulancia.class);
                startActivity(intent);
            }
        });
    }
}