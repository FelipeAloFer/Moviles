package com.example.actividad3_5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Ejemplo", "Estoy onCreate");
        setContentView(R.layout.activity_main);
    }
    protected void onStart() {
        super.onStart();
        Log.i("Ejemplo", "Estoy onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.i("Ejemplo", "Estoy onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.i("Ejemplo", "Estoy onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.i("Ejemplo", "Estoy onStop");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ejemplo", "Estoy onDestroy");
        Intent ejemplo = new Intent(getIntent().ACTION_VIEW);
        ejemplo.setData(Uri.parse("https://www.google.com/?hl=es"));
        startActivity(ejemplo);
    }
}