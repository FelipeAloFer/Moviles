package com.example.actividad3_33_4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    protected void onCreate(Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.second_activity);
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO", "Estoy onDestroy");
    }

    public void onButtonClick(View view) {
        Log.i("EJEMPLO", "Boton pulsado");
        Intent ejemplo = new Intent(this, MainActivity.class);
        startActivity(ejemplo);
    }
}

