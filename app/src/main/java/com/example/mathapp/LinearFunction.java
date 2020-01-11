package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
                startActivity(new Intent(LinearFunction.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(LinearFunction.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(LinearFunction.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(LinearFunction.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(LinearFunction.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(LinearFunction.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(LinearFunction.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(LinearFunction.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(LinearFunction.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(LinearFunction.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(LinearFunction.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(LinearFunction.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(LinearFunction.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(LinearFunction.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(LinearFunction.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
