package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnadd, btnsub, btnmult, btndiv ;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmult = findViewById(R.id.btnmult);
        btndiv = findViewById(R.id.btndiv);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);



    }
}
