package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
    }

    public void RectangleCount (View view)
    {
        TextView a=findViewById(R.id.rectangleEditTextA4);
        TextView b=findViewById(R.id.rectangleEditTextB);
        TextView result = findViewById(R.id.rectangleTextViewResult2);
        result.setText(" ");

        double tmpP=Double.valueOf(a.getText().toString())*Double.valueOf(b.getText().toString());
        double tmpO=Double.valueOf(a.getText().toString())*2+Double.valueOf(b.getText().toString())*2;

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
                startActivity(new Intent(Rectangle.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Rectangle.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Rectangle.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Rectangle.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Rectangle.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Rectangle.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Rectangle.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Rectangle.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Rectangle.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Rectangle.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Rectangle.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Rectangle.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Rectangle.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Rectangle.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Rectangle.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
