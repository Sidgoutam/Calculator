package com.example.sidharth.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button dec;
    private Button equ;
    private Button clear;
    private Button zero;
    private TextView operation;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char Choice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ "0");
            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Choice=EQU;
                result.setText(result.getText().toString()+ String.valueOf(val2) +"=" + String.valueOf(val1));
                operation.setText(null);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Choice=ADDITION;
                result.setText(String.valueOf(val1)+ "+");
                operation.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Choice=SUBTRACTION;
                result.setText(String.valueOf(val1)+ "-");
                operation.setText(null);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Choice=MULTIPLICATION;
                result.setText(String.valueOf(val1)+ "*");
                operation.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Choice=DIVISION;
                result.setText(String.valueOf(val1)+ "/");
                operation.setText(null);

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+ ".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.getText().length()>0){
                    CharSequence name = operation.getText().toString();
                    operation.setText(name.subSequence(0,name.length()-1));
                }
                else{
                    val1= Double.NaN;
                    val2=Double.NaN;
                    operation.setText(null);
                    result.setText(null);
                }
            }
        });

    }

    private void setUpViews(){
        one= (Button)findViewById(R.id.btn1);
        two= (Button)findViewById(R.id.btn2);
        three= (Button)findViewById(R.id.btn3);
        four= (Button)findViewById(R.id.btn4);
        five= (Button)findViewById(R.id.btn5);
        six= (Button)findViewById(R.id.btn6);
        seven= (Button)findViewById(R.id.btn7);
        eight= (Button)findViewById(R.id.btn8);
        nine= (Button)findViewById(R.id.btn9);
        zero= (Button)findViewById(R.id.btn0);
        dec= (Button)findViewById(R.id.btnDec);
        clear= (Button)findViewById(R.id.btnClear);
        add= (Button)findViewById(R.id.btnAdd);
        sub= (Button)findViewById(R.id.btnSub);
        mul= (Button)findViewById(R.id.btnMul);
        div= (Button)findViewById(R.id.btnDiv);
        equ= (Button)findViewById(R.id.btnEqu);
        operation = (TextView)findViewById(R.id.tvOp);
        result = (TextView)findViewById(R.id.tvRes);
        }

        private void compute(){
        if (!Double.isNaN(val1))
        {
            val2= Double.parseDouble(operation.getText().toString());
            switch (Choice){
                case ADDITION:
                    val1= val1+val2;
                    break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQU:
                    break;
            }
            }
         else
        {
            val1=Double.parseDouble(operation.getText().toString());
        }
        }
}
