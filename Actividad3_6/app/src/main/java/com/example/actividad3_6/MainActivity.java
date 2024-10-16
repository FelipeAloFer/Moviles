package com.example.actividad3_6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.activity_main);
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO", "Estoy onDestroy");
    }

    public void onButtonClick(View view) {
        Log.i("EJEMPLO", "Boton pulsado");
        Intent ejemplo = new Intent(Intent.ACTION_DIAL);
        startActivity(ejemplo);
    }
}
