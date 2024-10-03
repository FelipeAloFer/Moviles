package com.example.actividad3_33_4;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EJEMPLO", "Estoy onCreate");
        setContentView(R.layout.activity_main);
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
        Intent ejemplo = new Intent(this, SecondActivity.class);
        startActivity(ejemplo);
    }
}