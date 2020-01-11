package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Square extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    public void squareCount(View view)
    {
        TextView a=findViewById(R.id.squareEditTextA);
        TextView result = findViewById(R.id.squareTextViewResult);
        result.setText(" ");
        double tmpP=Double.valueOf(a.getText().toString())*Double.valueOf(a.getText().toString());
        double tmpO=Double.valueOf(a.getText().toString())*4;

        result.setText("Pole: "+tmpP+" \nObwód: "+tmpO);
    }
}
