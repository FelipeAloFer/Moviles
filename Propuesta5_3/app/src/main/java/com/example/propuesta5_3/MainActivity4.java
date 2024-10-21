package com.example.propuesta5_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
    TextView texto,texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        texto = (TextView) findViewById(R.id.texto);
        texto2 = (TextView) findViewById(R.id.texto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onButtonClick(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        texto.setText("Boton 1 Pulsado");
    }
    public void onButtonClick2(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        texto.setText("Boton 2 Pulsado");
    }
}