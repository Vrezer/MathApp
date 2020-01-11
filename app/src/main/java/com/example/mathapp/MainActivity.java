package com.example.mathapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
                    default:
            }
        return true;
    }
}
