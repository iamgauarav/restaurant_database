package com.example.restaurant_database;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Customer extends AppCompatActivity {
    ListView lv;
    ArrayAdapter adp;
    ArrayList<menu> menulist=new ArrayList<menu>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        lv=findViewById(R.id.lv);
        menulist.add(new menu("food",20));
        adp=new ArrayAdapter<menu>(Customer.this,android.R.layout.simple_list_item_1,menulist);
    }
}