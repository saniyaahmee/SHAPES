package com.example.area_of_shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Area_of_square extends AppCompatActivity {

    EditText mEditside;

    TextView mTextresult;
    Button mButtoncount;
    Button mButtonclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_square);

        mEditside = findViewById(R.id.side);

        mTextresult = findViewById(R.id.result1);
        mButtoncount = findViewById(R.id.count1);
        mButtonclear = findViewById(R.id.clear1);
        mButtoncount.setOnClickListener(v -> calculate());

    }

    @SuppressLint("SetTextI18n")
    public void calculate() {
        Double value1 = Double.parseDouble(mEditside.getText().toString());

        double calculateValue = value1 * value1;
        mTextresult.setText(Double.toString(calculateValue));
    }
}