package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnadd, btnsub, btnmult, btndiv ;
    EditText num1,num2;
    TextView tvresult;
    double number1, number2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button)findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmult = (Button)findViewById(R.id.btnmult);
        btndiv = (Button)findViewById(R.id.btndiv);

        num1 = (EditText)findViewById(R.id.num1);

        num2 = (EditText)findViewById(R.id.num2);

        tvresult = (TextView) findViewById(R.id.tvresult);


        //Add function
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length()>0 && num2.getText().length()>0){
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble(num2.getText().toString());
                result = number1 + number2;
                tvresult.setText("= "+result);
            }
            else
                if(num1.getText().length()==0){
                num1.setError("Enter number 1");
                }
                if(num2.getText().length()==0){
                    num2.setError("Enter number 2");
                }
            }

        });
        //Subtraction function
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length()>0 && num2.getText().length()>0){
                    number1 = Double.parseDouble(num1.getText().toString());
                    number2 = Double.parseDouble(num2.getText().toString());
                    result = number1 - number2;
                    tvresult.setText("= " + result);
            }
                else
                if(num1.getText().length()==0){
                    num1.setError("Enter number 1");
                }
                if(num2.getText().length()==0){
                    num2.setError("Enter number 2");
                }
            }
        });

        //Multiplication function
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() > 0 && num2.getText().length() > 0) {
                    number1 = Double.parseDouble(num1.getText().toString());
                    number2 = Double.parseDouble(num2.getText().toString());
                    result = number1 * number2;
                    tvresult.setText("= "+result);
                } else if (num1.getText().length() == 0) {
                    num1.setError("Enter number 1");
                }
                if (num2.getText().length() == 0) {
                    num2.setError("Enter number 2");
                }
            }
        });

        //Division function
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length()>0 && num2.getText().length()>0){
                number1 = Double.parseDouble(num1.getText().toString());
                number2 = Double.parseDouble(num2.getText().toString());
                result = number1 / number2;
                tvresult.setText("= "+result);
            }
                else
                if(num1.getText().length()==0){
                    num1.setError("Enter number 1");
                }
                if(num2.getText().length()==0) {
                    num2.setError("Enter number 2");
                }
            }
        });
    }
}
