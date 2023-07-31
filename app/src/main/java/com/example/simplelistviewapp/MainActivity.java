package com.example.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //1-create adapterView(listview)
    ListView listView;
    // 2- dataSource
    String[] worldCup22 = {
            "India",
            "japan",
            "China",
            "USA",
            "Pakistan"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        //3-adapter
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                R.layout.my_layout,
                R.id.textView,
                worldCup22
        );
        listView.setAdapter(adapter);
    }
}