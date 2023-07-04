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

public class cowcal extends AppCompatActivity {
    private EditText litres,fat;
    private Button calculate,clear;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cowcal);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


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

                if(l.isEmpty())
                {
                    Toast.makeText(cowcal.this, "Enter the litres", Toast.LENGTH_SHORT).show();
                }
                else if(f.isEmpty())
                {
                    Toast.makeText(cowcal.this, "Enter the fat percentage", Toast.LENGTH_SHORT).show();
                }
                else{

                    double litresValue = Double.parseDouble(l);
                    double fatValue = Double.parseDouble(f);
                    double price;
                    if(fatValue < 5.0)
                    {
                        price = 38.95;

                    }
                    else if(fatValue > 10.0)
                    {
                        price = 77.90;
                    }
                    else{

                    String fatString = String.valueOf(fatValue);
                    switch (fatString) {
                        case "5.0":
                            price = 38.95;
                            break;
                        case "6.7":
                            price = 52.19;
                            break;
                        case "8.4":
                            price = 65.44;
                            break;
                        case "5.1":
                            price = 39.73;
                            break;
                        case "6.8":
                            price = 52.97;
                            break;
                        case "8.5":
                            price = 66.22;
                            break;
                        case "5.2":
                            price = 40.51;
                            break;
                        case "6.9":
                            price = 53.75;
                            break;
                        case "8.6":
                            price = 66.99;
                            break;
                        case "5.3":
                            price = 41.29;
                            break;
                        case "7.0":
                            price = 54.53;
                            break;
                        case "8.7":
                            price = 67.77;
                            break;
                        case "7.1":
                            price = 55.31;
                            break;
                        case "8.8":
                            price = 68.55;
                            break;
                        case "5.4":
                            price = 42.07;
                            break;
                        case "5.5":
                            price = 42.85;
                            break;
                        case "7.2":
                            price = 56.09;
                            break;
                        case "8.9":
                            price = 69.33;
                            break;
                        case "5.6":
                            price = 43.62;
                            break;
                        case "7.3":
                            price = 56.87;
                            break;
                        case "9.0":
                            price = 70.11;
                            break;
                        case "5.7":
                            price = 44.40;
                            break;
                        case "7.4":
                            price = 57.65;
                            break;
                        case "9.1":
                            price = 70.89;
                            break;
                        case "5.8":
                            price = 45.18;
                            break;
                        case "7.5":
                            price = 58.43;
                            break;
                        case "9.2":
                            price = 71.67;
                            break;
                        case "5.9":
                            price = 45.96;
                            break;
                        case "7.6":
                            price = 59.20;
                            break;
                        case "9.3":
                            price = 72.45;
                            break;
                        case "6.0":
                            price = 46.74;
                            break;
                        case "6.1":
                            price = 47.52;
                            break;
                        case "7.9":
                            price = 61.54;
                            break;
                        case "6.3":
                            price = 49.08;
                            break;
                        case "9.7":
                            price = 75.56;
                            break;
                        case "6.4":
                            price = 49.86;
                            break;
                        case "8.0":
                            price = 62.32;
                            break;
                        case "8.1":
                            price = 63.10;
                            break;
                        case "8.2":
                            price = 63.88;
                            break;
                        case "9.8":
                            price = 76.34;
                            break;
                        case "6.5":
                            price = 50.64;
                            break;
                        case "9.9":
                            price = 77.12;
                            break;
                        case "6.6":
                            price = 51.41;
                            break;
                        case "8.3":
                            price = 64.66;
                            break;


                        case "7.7":
                            price = 59.98;
                            break;
                        case "9.4":
                            price = 73.23;
                            break;
                        case "7.8":
                            price = 60.76;
                            break;
                        case "9.5":
                            price = 74.01;
                            break;
                        case "6.2":
                            price = 48.30;
                            break;
                        case "9.6":
                            price = 74.79;
                            break;

                        case "10.0":
                            price = 77.90;
                            break;
                        default:
                            price = 0.0;
                            break;
                    }}

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











    }
}