package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TrianglesRectangular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangles_rectangular);
    }

    public void triangleRecCount(View view)
    {
        TextView a=findViewById(R.id.triangleRecEditTextA);
        TextView b=findViewById(R.id.triangleRecEditTextB);
        TextView result = findViewById(R.id.triangleRecTextViewResult);
        result.setText(" ");

        double tmpC=Math.sqrt(Math.pow(Double.valueOf(a.getText().toString()),2)+Math.pow(Double.valueOf(b.getText().toString()),2));
        result.setText("C wynosi: "+tmpC);
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
                startActivity(new Intent(TrianglesRectangular.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(TrianglesRectangular.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(TrianglesRectangular.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(TrianglesRectangular.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(TrianglesRectangular.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(TrianglesRectangular.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(TrianglesRectangular.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(TrianglesRectangular.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(TrianglesRectangular.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(TrianglesRectangular.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(TrianglesRectangular.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(TrianglesRectangular.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(TrianglesRectangular.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(TrianglesRectangular.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(TrianglesRectangular.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
