package com.example.propuesta5_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ImageDecoderKt;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imagen= (ImageView) findViewById(R.id.imagen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        }
    public void onButtonClick1(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alfa1);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick2(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alfa1);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick3(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alfa2);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick4(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.escala1);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick5(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.escala2);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick6(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.mueve1);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick7(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.mueve2);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick8(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotar1);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick9(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotar2);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }
    public void onButtonClick10(View view1) {
        Log.i("EJEMPLO", "Boton pulsado");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotar3);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(1);
        imagen.startAnimation(animation);
    }

}