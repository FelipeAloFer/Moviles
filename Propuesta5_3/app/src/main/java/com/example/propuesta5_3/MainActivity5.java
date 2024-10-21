package com.example.propuesta5_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {
    TextView texto,texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        texto = (TextView) findViewById(R.id.texto);
        Button button1 = findViewById(R.id.button); // Asegúrate de que este ID coincide con tu diseño XML

        // Configurar el listener del botón
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("EJEMPLO", "Botón pulsado");
                texto.setText("Botón 1 Pulsado");
            }
        });
        texto = (TextView) findViewById(R.id.texto);
        Button button2 = findViewById(R.id.button2); // Asegúrate de que este ID coincide con tu diseño XML

        // Configurar el listener del botón
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("EJEMPLO", "Botón pulsado");
                texto.setText("Botón 2 Pulsado");
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main4), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}