package com.example.actividad5_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onButtonClick1(View view) {
        Log.i("EJEMPLO", "Boton pulsado");
        Intent ejemplo = new Intent(this, Activity2.class);
        startActivity(ejemplo);
    }

    public void onButtonClick2(View view) {
        Log.i("EJEMPLO", "Boton pulsado");
        Intent ejemplo = new Intent(this, Activity3.class);
        startActivity(ejemplo);
    }

    public void onButtonClick3(View view) {
        Log.i("EJEMPLO", "Boton pulsado");
        Intent ejemplo = new Intent(this, Activity4.class);
        startActivity(ejemplo);
    }

    public void onButtonClick4(View view) {
        Log.i("EJEMPLO", "Boton pulsado");
        Intent ejemplo = new Intent(this, Activity5.class);
        startActivity(ejemplo);
    }
}