package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView result;
    Button convert_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.unitCounterText);
        result = findViewById(R.id.tv_result);
        convert_btn = findViewById(R.id.btn_convert);

        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilos_entered = Double.parseDouble(input.getText().toString());
                result.setText(""+convertToPounds(kilos_entered) + " lb");
            }
        });
    }

    public double convertToPounds(double kilos) {
        return kilos * 2.204625;
    }
}