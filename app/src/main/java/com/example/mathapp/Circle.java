package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    public void circleCount (View view)
    {
        TextView r=findViewById(R.id.circleEditTextR);
        TextView result = findViewById(R.id.circleTextViewResult);
        result.setText(" ");
        double tmpP= Math.PI*Math.pow(Double.valueOf(r.getText().toString()),2);
        double tmpO= Math.PI*2*Double.valueOf(r.getText().toString());
        result.setText("Pole wynosi: "+tmpP+"\nobwód wynosi: "+tmpO);
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
                startActivity(new Intent(Circle.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Circle.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Circle.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Circle.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Circle.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Circle.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Circle.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Circle.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Circle.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Circle.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Circle.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Circle.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Circle.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Circle.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Circle.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
