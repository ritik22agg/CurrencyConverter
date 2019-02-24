package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText val = (EditText) findViewById(R.id.value);
        String s1 = val.getText().toString();
        Double value = Double.parseDouble(s1);
        Double ans = value / 72;
        Toast.makeText(MainActivity.this, "" + ans + "$", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
