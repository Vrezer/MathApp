package com.example.mathapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


/////////////////////////////////////////MENU////////////////////////////////////
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
                    startActivity(new Intent(MainActivity.this, MultiplicationTable.class));
                    return true;
                case R.id.menuLinearFunction:
                    startActivity(new Intent(MainActivity.this, LinearFunction.class));
                    return true;
                case R.id.menuQuadraticFunction:
                    startActivity(new Intent(MainActivity.this, QuadraticFunction.class));
                    return true;
                case R.id.menuArithmeticString:
                    startActivity(new Intent(MainActivity.this, ArithmeticString.class));
                    return true;
                case R.id.menuGeometricString:
                    startActivity(new Intent(MainActivity.this, GeometricString.class));
                    return true;
                case R.id.menuSubSquare:
                    startActivity(new Intent(MainActivity.this, Square.class));
                    return true;
                case R.id.menuSubRectangle:
                    startActivity(new Intent(MainActivity.this, Rectangle.class));
                    return true;
                case R.id.menuSubTrianglesEquilateral:
                    startActivity(new Intent(MainActivity.this, TriangleEquilateral.class));
                    return true;
                case R.id.menuSubTrianglesRectangular:
                    startActivity(new Intent(MainActivity.this, TrianglesRectangular.class));
                    return true;
                case R.id.menuSubCircle:
                    startActivity(new Intent(MainActivity.this, Circle.class));
                    return true;
                case R.id.menuSubSolidCube:
                    startActivity(new Intent(MainActivity.this, Cube.class));
                    return true;
                case R.id.menuSubSolidCuboid:
                    startActivity(new Intent(MainActivity.this, Cuboid.class));
                    return true;
                case R.id.menuSubSolidSphere:
                    startActivity(new Intent(MainActivity.this, Sphere.class));
                    return true;
                case R.id.menuSubSolidCone:
                    startActivity(new Intent(MainActivity.this, Cone.class));
                    return true;
                case R.id.menuMainPage:
                    startActivity(new Intent(MainActivity.this, MainActivity.class));
                    return true;
                    default:
            }
        return true;
    }
}
