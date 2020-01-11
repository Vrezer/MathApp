package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
                startActivity(new Intent(Square.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Square.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Square.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Square.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Square.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Square.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Square.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Square.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Square.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Square.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Square.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Square.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Square.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Square.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Square.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
