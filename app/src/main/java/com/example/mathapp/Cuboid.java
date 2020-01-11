package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Cuboid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
    }

    public void cuboidCount(View view)
    {
        TextView a=findViewById(R.id.cuboidEditTextA);
        TextView b=findViewById(R.id.cuboidEditTextB);
        TextView c=findViewById(R.id.cuboidEditTextC);
        TextView result = findViewById(R.id.cuboidTextViewResult);
        result.setText(" ");
        double ab,ac,bc;
        ab=Double.valueOf(a.getText().toString())*Double.valueOf(b.getText().toString());
        ac=Double.valueOf(a.getText().toString())*Double.valueOf(c.getText().toString());
        bc=Double.valueOf(b.getText().toString())*Double.valueOf(c.getText().toString());
        double tmpP=(2*(ab+ac+bc));
        double tmpV=Double.valueOf(a.getText().toString())*Double.valueOf(b.getText().toString())*Double.valueOf(c.getText().toString());

        result.setText("Pole: "+tmpP+"\nObjętość: "+tmpV);
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
                startActivity(new Intent(Cuboid.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Cuboid.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Cuboid.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Cuboid.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Cuboid.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Cuboid.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Cuboid.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Cuboid.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Cuboid.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Cuboid.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Cuboid.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Cuboid.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Cuboid.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Cuboid.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Cuboid.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
