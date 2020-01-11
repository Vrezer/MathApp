package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TriangleEquilateral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_equilateral);
    }

    public void triangleEqCount(View view)
    {
        TextView a=findViewById(R.id.triangleEqEditTextA);
        TextView result = findViewById(R.id.triangleEqTextViewResult);
        result.setText(" ");

        double tmpP=(Math.pow(Double.valueOf(a.getText().toString()),2)*Math.sqrt(3))/4;
        double tmpH=(Double.valueOf(a.getText().toString())*Math.sqrt(3))/6;
        result.setText("Pole: "+tmpP+" \nWysokość: "+tmpH);
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
                startActivity(new Intent(TriangleEquilateral.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(TriangleEquilateral.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(TriangleEquilateral.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(TriangleEquilateral.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(TriangleEquilateral.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(TriangleEquilateral.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(TriangleEquilateral.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(TriangleEquilateral.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(TriangleEquilateral.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(TriangleEquilateral.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(TriangleEquilateral.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(TriangleEquilateral.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(TriangleEquilateral.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(TriangleEquilateral.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(TriangleEquilateral.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
