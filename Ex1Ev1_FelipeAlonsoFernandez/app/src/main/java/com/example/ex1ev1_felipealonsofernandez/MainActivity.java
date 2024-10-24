package com.example.ex1ev1_felipealonsofernandez;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

    TextView visor;
    private double num1 = 0;
    private double num2 = 0;
    private String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = findViewById(R.id.visor);

        setListenerNumeros(R.id.btn0, "0");
        setListenerNumeros(R.id.btn1, "1");
        setListenerNumeros(R.id.btn2, "2");
        setListenerNumeros(R.id.btn3, "3");
        setListenerNumeros(R.id.btn4, "4");
        setListenerNumeros(R.id.btn5, "5");
        setListenerNumeros(R.id.btn6, "6");
        setListenerNumeros(R.id.btn7, "7");
        setListenerNumeros(R.id.btn8, "8");
        setListenerNumeros(R.id.btn9, "9");
        setListenerNumeros(R.id.btnDecimal, ".");

        setListenerOperadores(R.id.btnSumar, "+");
        setListenerOperadores(R.id.btnRestar, "-");
        setListenerOperadores(R.id.btnMultiplicar, "*");
        setListenerOperadores(R.id.btnDividir, "/");
        setListenerOperadores(R.id.btnPotencia, "^");
        setListenerOperadores(R.id.btnLimpiar, "");

        Button equalsButton = findViewById(R.id.btnIgual);
        equalsButton.setOnClickListener(v -> calcularResultado());
    }

    private void setListenerNumeros(int buttonId, String value) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            visor.append(value);
        });
    }

    private void setListenerOperadores(int buttonId, String op) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            if (!visor.getText().toString().isEmpty()) {
                num1 = Double.parseDouble(visor.getText().toString());
                operador = op;
                visor.setText("");
            }
        });
    }

    private void calcularResultado() {
        if (!visor.getText().toString().isEmpty()) {
            num2 = Double.parseDouble(visor.getText().toString());
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        visor.setText("Error");
                        return;
                    }
                    break;
                case "^":
                    resultado = Math.pow(num1, num2);

            }
            visor.setText(String.valueOf(resultado));
        }
    }
}