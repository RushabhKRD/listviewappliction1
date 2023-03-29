package com.example.listviewappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BhajiyaActivity2 extends AppCompatActivity {
    TextView bhajiya;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhajiya2);
        bhajiya=findViewById(R.id.bhajiya);
        lst=findViewById(R.id.lst);
        String[] bhajiya={"marchi pati","tamoto bhajiya","marchi pati","tamoto bhajiya","marchi pati","tamoto bhajiya"};
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,bhajiya);
        lst.setAdapter(ad);

    }
}