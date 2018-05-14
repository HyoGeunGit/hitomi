package com.example.shimh.dasf;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        adapter = new ListviewAdapter;
        listView.setAdapter(adapter);

        adapter.additem(ContextCompat.getDrawable(this,R.drawable.asdf),"히요비","Atomic_bomb");
    }

}
