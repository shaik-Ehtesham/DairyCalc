package com.example.dairycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class buffcal extends AppCompatActivity {
    private EditText litres,fat;
    private Button calculate,clear;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffcal);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        litres = findViewById(R.id.litres);
        fat = findViewById(R.id.fat);
        res = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);
        clear = findViewById(R.id.clear);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = litres.getText().toString();
                String f = fat.getText().toString();

                if (l.isEmpty()) {
                    Toast.makeText(buffcal.this, "Enter the litres", Toast.LENGTH_SHORT).show();
                } else if (f.isEmpty()) {
                    Toast.makeText(buffcal.this, "Enter the fat percentage", Toast.LENGTH_SHORT).show();
                } else {

                    double litresValue = Double.parseDouble(l);
                    double fatValue = Double.parseDouble(f);
                    double price;
                    if (fatValue < 3.0) {
                        price = 34.44;

                    } else if (fatValue > 4.5) {
                        price = 38.94;
                    } else {

                        String fatString = String.valueOf(fatValue);
                        switch (fatString) {
                            case "3.0":
                                price = 34.44;
                                break;
                            case "3.8":
                                price = 36.84;
                                break;
                            case "3.1":
                                price = 34.74;
                                break;
                            case "3.2":
                                price = 35.04;
                                break;
                            case "3.9":
                                price = 37.14;
                                break;
                            case "3.3":
                                price = 35.34;
                                break;
                            case "4.0":
                                price = 37.44;
                                break;
                            case "3.4":
                                price = 35.64;
                                break;
                            case "3.5":
                                price = 35.94;
                                break;
                            case "4.1":
                                price = 37.74;
                                break;
                            case "4.2":
                                price = 38.04;
                                break;
                            case "3.6":
                                price = 36.24;
                                break;
                            case "3.7":
                                price = 36.54;
                                break;
                            case "4.3":
                                price = 38.34;
                                break;
                            case "4.4":
                                price = 38.64;
                                break;
                            case "4.5":
                                price = 38.94;
                                break;
                            default:
                                price = 0.0;
                                break;
                        }
                    }

                    double result = litresValue * price;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    String formattedResult = decimalFormat.format(result);
                    res.setText(formattedResult);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
                litres.setText("");
                fat.setText("");

            }
        });


    }}