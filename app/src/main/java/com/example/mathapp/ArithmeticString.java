package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ArithmeticString extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic_string);

    }


    public void SumString (View view)
    {
        TextView a1=findViewById(R.id.ArithmetictStringEditTextA1);
        TextView an=findViewById(R.id.arithmetictStringEditTextAn);
        TextView n=findViewById(R.id.arithmetictStringEditTextN);
        ImageView image=findViewById(R.id.ArithmetictStringImageView);
        TextView result=findViewById(R.id.ArithmetictStringTextViewResult);
        Button button=findViewById(R.id.ArithmetictStringButtonCount);
        button.setVisibility(View.VISIBLE);
        a1.setVisibility(View.VISIBLE);
        an.setVisibility(View.VISIBLE);
        n.setVisibility(View.VISIBLE);
        result.setVisibility(View.VISIBLE);
        image.setImageResource(R.drawable.ciagarytmetycznysuma);
        //NWORD
        TextView r=findViewById(R.id.arithmetictStringEditTextR);
        r.setVisibility(View.INVISIBLE);
        Button button1=findViewById(R.id.arithmetictStringButtonCountNword);
        button1.setVisibility(View.INVISIBLE);
        result.setText("");

    }

    public void SumStringLogic (View view)
    {
        TextView a1=findViewById(R.id.ArithmetictStringEditTextA1);
        TextView an=findViewById(R.id.arithmetictStringEditTextAn);
        TextView n=findViewById(R.id.arithmetictStringEditTextN);
        TextView result=findViewById(R.id.ArithmetictStringTextViewResult);
        double suma= (((Double.valueOf(a1.getText().toString())
                *Double.valueOf(an.getText().toString()))/2)
                *Double.valueOf(n.getText().toString()));
        String tmp="Suma Ciagu wynosi: ";
        result.setText(tmp+suma);



    }

    public void NwordString(View view)
    {
        //SuumString
        TextView a1=findViewById(R.id.ArithmetictStringEditTextA1);
        TextView an=findViewById(R.id.arithmetictStringEditTextAn);
        TextView n=findViewById(R.id.arithmetictStringEditTextN);
        ImageView image=findViewById(R.id.ArithmetictStringImageView);
        TextView result=findViewById(R.id.ArithmetictStringTextViewResult);
        Button button=findViewById(R.id.ArithmetictStringButtonCount);
        button.setVisibility(View.INVISIBLE);
        a1.setVisibility(View.VISIBLE);
        an.setVisibility(View.INVISIBLE);
        n.setVisibility(View.VISIBLE);
        result.setVisibility(View.VISIBLE);
        result.setText("");
        image.setImageResource(R.drawable.ciagarytmetycznynwyraz);
        // NwordString
        TextView r=findViewById(R.id.arithmetictStringEditTextR);
        r.setVisibility(View.VISIBLE);
        Button button1=findViewById(R.id.arithmetictStringButtonCountNword);
        button1.setVisibility(View.VISIBLE);
        result.setText("");
    }

    public void NwordStringLogic (View view)
    {
        TextView a1=findViewById(R.id.ArithmetictStringEditTextA1);
        TextView n=findViewById(R.id.arithmetictStringEditTextN);
        TextView result=findViewById(R.id.ArithmetictStringTextViewResult);
        TextView r=findViewById(R.id.arithmetictStringEditTextR);
        double sum=Double.valueOf(a1.getText().toString())+(Double.valueOf(n.getText().toString())-1)*Double.valueOf(r.getText().toString());
        result.setText("N-ty Wyraz Ciągu wynosi: "+sum);
    }
/////////////MENU/////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menuMultiplicationTable:
                startActivity(new Intent(ArithmeticString.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(ArithmeticString.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(ArithmeticString.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(ArithmeticString.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(ArithmeticString.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(ArithmeticString.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(ArithmeticString.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(ArithmeticString.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(ArithmeticString.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(ArithmeticString.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(ArithmeticString.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(ArithmeticString.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(ArithmeticString.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(ArithmeticString.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(ArithmeticString.this, MainActivity.class));
            return true;
            default:
        }
        return true;
    }

}
