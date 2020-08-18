package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText eNo1,eNo2;
    String n1;
    String n2;
    int no1,no2;
    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        eNo1 = findViewById(R.id.eNo1);
        eNo2 = findViewById(R.id.eNo2);

        lblResult = findViewById(R.id.lblResult);

        Intent intent = getIntent();

        n1 = intent.getStringExtra("no1");
        n2 = intent.getStringExtra("no2");

        eNo1.setText(n1);
        eNo2.setText(n2);

        no1 = Integer.parseInt(n1);
        no2 = Integer.parseInt(n2);

    }

    public void add(View view){

        lblResult.setText(n1 + " + "+ n2 +" = " +(no1+no2));
    }

    public void substract(View view){

        lblResult.setText(n1 +" - " + n2 + " = " +(no1-no2));
    }

    public void multyply(View view){

        lblResult.setText(n1 + " * " + n2 + " = " + (no1*no2));
    }


    public void devide(View view){

        lblResult.setText(n1 +" / " + n2 + " = " +(no1/no2));
    }
}