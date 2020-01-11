package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Cone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
    }

    public void coneCountPc(View view)
    {
        TextView r=findViewById(R.id.coneEditTextR);
        TextView l=findViewById(R.id.coneEditTextL);
        TextView result = findViewById(R.id.coneTextViewResult);
        result.setText(" ");

        double tmpPp=Math.PI*Math.pow(Double.valueOf(r.getText().toString()),2);
        double tmpPb=Math.PI*Double.valueOf(r.getText().toString())*Double.valueOf(l.getText().toString());
        double tmpPc=tmpPb+tmpPp;

        result.setText("Pp: "+tmpPp+"\nPb: "+tmpPb+"\nPc: "+tmpPc);
    }

    public void coneCountV (View view)
    {
        TextView r=findViewById(R.id.coneEditTextR);
        TextView h=findViewById(R.id.coneEditTextH);
        TextView result = findViewById(R.id.coneTextViewResult);
        result.setText(" ");
        double tmpPp=Math.PI*Math.pow(Double.valueOf(r.getText().toString()),2);
        double tmpV=(Double.valueOf(h.getText().toString())*tmpPp)/3;

        result.setText("V: "+tmpV);
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
                startActivity(new Intent(Cone.this, MultiplicationTable.class));
                return true;
            case R.id.menuLinearFunction:
                startActivity(new Intent(Cone.this, LinearFunction.class));
                return true;
            case R.id.menuQuadraticFunction:
                startActivity(new Intent(Cone.this, QuadraticFunction.class));
                return true;
            case R.id.menuArithmeticString:
                startActivity(new Intent(Cone.this, ArithmeticString.class));
                return true;
            case R.id.menuGeometricString:
                startActivity(new Intent(Cone.this, GeometricString.class));
                return true;
            case R.id.menuSubSquare:
                startActivity(new Intent(Cone.this, Square.class));
                return true;
            case R.id.menuSubRectangle:
                startActivity(new Intent(Cone.this, Rectangle.class));
                return true;
            case R.id.menuSubTrianglesEquilateral:
                startActivity(new Intent(Cone.this, TriangleEquilateral.class));
                return true;
            case R.id.menuSubTrianglesRectangular:
                startActivity(new Intent(Cone.this, TrianglesRectangular.class));
                return true;
            case R.id.menuSubCircle:
                startActivity(new Intent(Cone.this, Circle.class));
                return true;
            case R.id.menuSubSolidCube:
                startActivity(new Intent(Cone.this, Cube.class));
                return true;
            case R.id.menuSubSolidCuboid:
                startActivity(new Intent(Cone.this, Cuboid.class));
                return true;
            case R.id.menuSubSolidSphere:
                startActivity(new Intent(Cone.this, Sphere.class));
                return true;
            case R.id.menuSubSolidCone:
                startActivity(new Intent(Cone.this, Cone.class));
                return true;
            case R.id.menuMainPage:
                startActivity(new Intent(Cone.this, MainActivity.class));
                return true;
            default:
        }
        return true;
    }
}
