package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GeometricString extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric_string);
    }


    public void SumString (View view)
    {

        ImageView image=findViewById(R.id.GeometricStringImageView);
        TextView result=findViewById(R.id.GeometricStringTextViewResult);
        result.setText("");
        image.setImageResource(R.drawable.ciaggeometrycznysuma);
        Button button=findViewById(R.id.GeometricStringButtonCount);
        button.setVisibility(View.VISIBLE);
        Button button1=findViewById(R.id.geometricStringButtonNWord);
        button1.setVisibility(View.INVISIBLE);
    }



    public void NwordString(View view)
    {
        ImageView image=findViewById(R.id.GeometricStringImageView);
        TextView result=findViewById(R.id.GeometricStringTextViewResult);
        result.setText("");
        image.setImageResource(R.drawable.ciaggeometrycznynwyraz);
        Button button=findViewById(R.id.GeometricStringButtonCount);
        button.setVisibility(View.INVISIBLE);
        Button button1=findViewById(R.id.geometricStringButtonNWord);
        button1.setVisibility(View.VISIBLE);
    }

    public void SumStringLogic (View view)
    {
        TextView resulttext=findViewById(R.id.GeometricStringTextViewResult);
        TextView a1=findViewById(R.id.GeometricStringEditTextA1);
        TextView n=findViewById(R.id.geometricStringEditTextN);
        TextView q=findViewById(R.id.geometricStringEditTextQ);
        double result;


        if (Double.valueOf(q.getText().toString())==1)
        {
            result=(Double.valueOf(a1.getText().toString())*Double.valueOf(n.getText().toString()));
            resulttext.setText("Suma Wynosi: "+result);
        }
        else
        {
            result=(Double.valueOf(a1.getText().toString())*(
                    (1-Math.pow(Double.valueOf(q.getText().toString()),Integer.parseInt(n.getText().toString())))/
            1-Double.valueOf(q.getText().toString())));
            resulttext.setText("Suma wynosi: "+result);
        }
    }

    public void NwordStringLogic(View view)
    {
        TextView resulttext=findViewById(R.id.GeometricStringTextViewResult);
        TextView a1=findViewById(R.id.GeometricStringEditTextA1);
        TextView n=findViewById(R.id.geometricStringEditTextN);
        TextView q=findViewById(R.id.geometricStringEditTextQ);
        double result;
        result = Double.valueOf(a1.getText().toString())*Math.pow(Double.valueOf(q.getText().toString()),(Integer.parseInt(n.getText().toString())-1)) ;
        resulttext.setText("N-ty wyraz wynosi: "+result);
    }
}
