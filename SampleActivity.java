package com.example.student.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SampleActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] Banknames={"SBI","IOB","HDFC","Canara","KVB"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa=new
                ArrayAdapter(this,android.R.layout.simple_spinner_item,Banknames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
Toast.makeText(getApplicationContext(), Banknames[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
