package com.example.area_of_shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Area_of_circle extends AppCompatActivity {


    EditText mEditradius;

    TextView mTextresult;
    Button mButtoncount;
    Button mButtonclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_circle);
        mEditradius= findViewById(R.id.radius);

        mTextresult = findViewById(R.id.result2);
        mButtoncount = findViewById(R.id.count2);
        mButtonclear = findViewById(R.id.clear2);
        mButtoncount.setOnClickListener(v -> calculate());

    }

    @SuppressLint("SetTextI18n")
    public void calculate() {
        Double value1 = Double.parseDouble(mEditradius.getText().toString());

        double calculateValue = (3.14)*(value1 * value1);
        mTextresult.setText(Double.toString(calculateValue));
    }
}