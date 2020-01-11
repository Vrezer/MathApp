package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MultiplicationTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_table);
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
                startActivity(new Intent(MultiplicationTable.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(MultiplicationTable.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(MultiplicationTable.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(MultiplicationTable.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(MultiplicationTable.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(MultiplicationTable.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(MultiplicationTable.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(MultiplicationTable.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(MultiplicationTable.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(MultiplicationTable.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(MultiplicationTable.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(MultiplicationTable.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(MultiplicationTable.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(MultiplicationTable.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(MultiplicationTable.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
