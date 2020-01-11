package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
    }

    public void cubeCount(View view)
    {
        TextView a=findViewById(R.id.cubeEditTextA);
        TextView result = findViewById(R.id.cubeTextViewResult);
        result.setText(" ");

        double tmpPC=6*Math.pow(Double.valueOf(a.getText().toString()),2);
        double tmpV=Math.pow(Double.valueOf(a.getText().toString()),3);

        result.setText("Pole; "+tmpPC+"\nObjętość: "+tmpV);
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
                startActivity(new Intent(Cube.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Cube.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Cube.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Cube.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Cube.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Cube.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Cube.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Cube.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Cube.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Cube.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Cube.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Cube.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Cube.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Cube.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Cube.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
