package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_function);

    }


   public void calculate(View view)

    {
        EditText a =findViewById(R.id.linearFunctionEditTextA);
        EditText b=findViewById(R.id.linearFunctionEditTextB);
        TextView result =findViewById(R.id.LinearFunctionTextViewResult);
        double x=new Double(a.getText().toString());
        double y=new Double(b.getText().toString());

        double resultt;
        if (x!=0) {
            resultt=-y/x;
            result.setText(String.valueOf(resultt));
        }
            else if (y!=0)
            {
            result.setText("Równanie sprzeczne! ");
            }
            else
        {
            result.setText("Nieskończenie wiele rozwiązań");
        }
    }
}
