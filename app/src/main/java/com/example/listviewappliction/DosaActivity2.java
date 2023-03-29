package com.example.listviewappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DosaActivity2 extends AppCompatActivity {
    TextView dhosa;
    ListView lst;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosa2);
        dhosa=findViewById(R.id.dhosa);
        lst=findViewById(R.id.lst);
        String[]  dhosa={"Palak panner","Chessy","sada dhosa","Panner Tika","Palak panner","Chessy","sada dhosa","Panner Tika"};
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,dhosa);
        lst.setAdapter(ad);

    }
}