package com.example.prueba;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad3_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EJEMPLO", "Estoy onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.i("EJEMPLO", "Estoy onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.i("EJEMPLO", "Estoy onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i("EJEMPLO", "Estoy onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i("EJEMPLO", "Estoy onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO", "Estoy onDestroy");
    }
}