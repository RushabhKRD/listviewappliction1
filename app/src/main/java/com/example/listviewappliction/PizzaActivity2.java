package com.example.listviewappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PizzaActivity2 extends AppCompatActivity {
    TextView pizza;
    ListView lst;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza2);
        pizza=findViewById(R.id.pizza);
        lst=findViewById(R.id.lst);
        String[]  pizzas={"Margerita","7 Chessy","Farm house","Panner Tika","Margerita","7 Chessy","Farm house","Panner Tika"};
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,pizzas);
        lst.setAdapter(ad);

    }
}