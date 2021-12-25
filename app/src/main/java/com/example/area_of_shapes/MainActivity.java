package com.example.area_of_shapes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rectangular,square,circle,triangle;
        rectangular=findViewById(R.id.rectangular);
        square=findViewById(R.id.square);
        circle=findViewById(R.id.circle);
        triangle=findViewById(R.id.triangle);
        rectangular.setOnClickListener(v ->{
            Intent intent=new Intent(getApplicationContext(),Area_of_rectangular.class);
            startActivity(intent);
        });
        square.setOnClickListener(v ->{
            Intent intent=new Intent(getApplicationContext(),Area_of_square.class);
            startActivity(intent);
        });
        circle.setOnClickListener(v ->{
            Intent intent=new Intent(getApplicationContext(),Area_of_circle.class);
            startActivity(intent);
        });
        triangle.setOnClickListener(v ->{
            Intent intent=new Intent(getApplicationContext(),Area_of_triangle.class);
            startActivity(intent);
        });
    }

}