package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        setNumberListener(R.id.btn0, "0");
        setNumberListener(R.id.btn1, "1");
        setNumberListener(R.id.btn2, "2");
        setNumberListener(R.id.btn3, "3");
        setNumberListener(R.id.btn4, "4");
        setNumberListener(R.id.btn5, "5");
        setNumberListener(R.id.btn6, "6");
        setNumberListener(R.id.btn7, "7");
        setNumberListener(R.id.btn8, "8");
        setNumberListener(R.id.btn9, "9");

        setOperatorListener(R.id.btnAdd, "+");
        setOperatorListener(R.id.btnSubtract, "-");
        setOperatorListener(R.id.btnMultiply, "*");
        setOperatorListener(R.id.btnDivide, "/");

        Button equalsButton = findViewById(R.id.btnEquals);
        equalsButton.setOnClickListener(v -> calculateResult());
    }

    private void setNumberListener(int buttonId, String value) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            display.append(value);
        });
    }

    private void setOperatorListener(int buttonId, String op) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            if (!display.getText().toString().isEmpty()) {
                num1 = Double.parseDouble(display.getText().toString());
                operator = op;
                display.setText(""); // Limpiar la pantalla para el siguiente número
            }
        });
    }

    private void calculateResult() {
        if (!display.getText().toString().isEmpty()) {
            num2 = Double.parseDouble(display.getText().toString());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(result));
        }
    }
}
