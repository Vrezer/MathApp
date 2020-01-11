package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
    }

    public void sphereCount(View view) {
        TextView r = findViewById(R.id.sphereEditTextR);
        TextView result = findViewById(R.id.sphereTextViewResult);
        result.setText(" ");

        double tmpP = 4 * Math.PI * Math.pow(Double.valueOf(r.getText().toString()), 2);
        double tmpV = (4 / 3) * (Math.PI * Math.pow(Double.valueOf(r.getText().toString()), 3));

        result.setText("Pole: " + tmpP + "\nObjętość: " + tmpV);
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
        switch (item.getItemId()) {
            case R.id.menuMultiplicationTable:
                startActivity(new Intent(Sphere.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Sphere.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Sphere.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Sphere.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Sphere.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Sphere.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Sphere.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Sphere.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Sphere.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Sphere.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Sphere.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Sphere.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Sphere.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Sphere.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Sphere.this, MainActivity.class));
                return true;
            default:
        }
                return true;
    }
}
