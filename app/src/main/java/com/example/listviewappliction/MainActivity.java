package com.example.listviewappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView food;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        food=findViewById(R.id.food);
        list=findViewById(R.id.list);
        String[]  food={"Pizza","Dosa","Bhajiya","Burger"};
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,food);
        list.setAdapter(ad);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "This is Pizza", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,PizzaActivity2.class);
                    startActivity(i);
                }
                if(position==1){
                    Toast.makeText(MainActivity.this, "This is Dosa", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,DosaActivity2.class);
                    startActivity(i);
                }
                if(position==2){
                    Toast.makeText(MainActivity.this, "This is Bhajiya", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,BhajiyaActivity2.class);
                    startActivity(i);
                }
                if(position==3){
                    Toast.makeText(MainActivity.this, "This is Burger", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,BurgerActivity2.class);
                    startActivity(i);
                }
            }
        });
    }
}