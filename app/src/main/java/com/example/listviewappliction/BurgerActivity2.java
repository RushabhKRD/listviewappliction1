package com.example.listviewappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BurgerActivity2 extends AppCompatActivity {
    TextView burger;
    ListView lst;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger2);
        burger=findViewById(R.id.burger);
        lst=findViewById(R.id.lst);
        String[]  burger={"Maharaja burger","Maharaja burger","Maharaja burger","Maharaja burger","Maharaja burger","Maharaja burger"};
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,burger);
        lst.setAdapter(ad);

    }
}