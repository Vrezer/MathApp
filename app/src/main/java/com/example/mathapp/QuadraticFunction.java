package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class QuadraticFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_function);
    }


    public void QuadraticFunctionLogic(View view)
    {
        ImageView image=findViewById(R.id.QuadraticFunctionImageView);
        EditText c =findViewById(R.id.quadraticFunctionEditTextC);
        TextView result =findViewById(R.id.QuadraticFunctionTextView);
        EditText b=findViewById(R.id.QuadraticFunctionEditTextB);
        EditText a=findViewById(R.id.QuadraticFunctionEditTextA);
        double a1=new Double(a.getText().toString());
        double b1=new Double(b.getText().toString());
        double c1=new Double(c.getText().toString());
        double delta;
        double x1,x2;
        delta = b1*b1-4*a1*c1;
        if (a1==0)
        {
            result.setText("To nie jest funkcja kwadratowa! ");
            image.setImageResource(R.drawable.ic_launcher_background);
        }
        else if(delta<0)
        {
            String text="Brak rozwiazania";
            result.setText(text);
        }
        else if (delta==0)
        {
            double x0=-b1/2*a1;
            result.setText(String.valueOf(x0));
        }
        else
        {
            x1=(-b1+Math.sqrt(delta))/2*a1;
            x2=(-b1-Math.sqrt(delta))/2*a1;
            String tmp=x1+"\n"+x2;
            result.setText(tmp);
        }


        // OBRAZKI
        if (a1>0&& delta<0 )
        {
            image.setImageResource(R.drawable.kwadratowa1);
        }
        else if (a1>0 && delta==0 )
        {
            image.setImageResource(R.drawable.kwadratowa2);
        }
        else if (a1>0 && delta>0 )
        {
            image.setImageResource(R.drawable.kwadratowa3);
        }
        else if (a1<0 && delta<0 )
        {
            image.setImageResource(R.drawable.kwadratowa4);
        }
        else if (a1<0 && delta==0 )
        {
            image.setImageResource(R.drawable.kwadratowa5);
        }
        else if (a1<0 && delta>0 )
        {
            image.setImageResource(R.drawable.kwadratowa6);
        }
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
                startActivity(new Intent(QuadraticFunction.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(QuadraticFunction.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(QuadraticFunction.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(QuadraticFunction.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(QuadraticFunction.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(QuadraticFunction.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(QuadraticFunction.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(QuadraticFunction.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(QuadraticFunction.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(QuadraticFunction.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(QuadraticFunction.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(QuadraticFunction.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(QuadraticFunction.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(QuadraticFunction.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(QuadraticFunction.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
