package com.example.area_of_shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import  android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
public class Area_of_triangle extends AppCompatActivity {

    EditText mEditheight;
    EditText mEditbase;
    TextView mTextresult;
    Button mButtoncount;
    Button mButtonclear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_triangle);

        mEditheight= findViewById(R.id.height);
        mEditbase= findViewById(R.id.base);
        mTextresult = findViewById(R.id.result3);
        mButtoncount = findViewById(R.id.count3);
        mButtonclear = findViewById(R.id.clear3);
        mButtoncount.setOnClickListener(v -> calculate());

    }

    @SuppressLint("SetTextI18n")
    public void calculate() {
        Double value1 = Double.parseDouble(mEditheight.getText().toString());
        Double value2 = Double.parseDouble(mEditbase.getText().toString());

        double calculateValue =(0.5 )*(3.14)*(value1 * value2);
        mTextresult.setText(Double.toString(calculateValue));
    }
}