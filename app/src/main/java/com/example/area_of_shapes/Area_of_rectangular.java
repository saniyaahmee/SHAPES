package com.example.area_of_shapes;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Area_of_rectangular extends AppCompatActivity {

    EditText mEditheight;
    EditText mEditwidth;
    TextView mTextresult;
    Button mButtoncount;
    Button mButtonclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_rectangular);

        mEditheight = findViewById(R.id.hight);
        mEditwidth = findViewById(R.id.result);
        mTextresult = findViewById(R.id.width);
        mButtoncount = findViewById(R.id.count);
        mButtonclear = findViewById(R.id.clear);
        mButtoncount.setOnClickListener(v -> calculate());


    }
    @SuppressLint("SetTextI18n")
    public void calculate() {
        Double value1 = Double.parseDouble(mEditheight.getText().toString());
        Double value2 = Double.parseDouble(mEditwidth.getText().toString());
        double calculateValue = value1 * value2;
        mTextresult.setText(Double.toString(calculateValue));
    }



}