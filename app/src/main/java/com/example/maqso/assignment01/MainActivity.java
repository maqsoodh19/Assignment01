package com.example.maqso.assignment01;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView view = (RecyclerView) findViewById(R.id.rview);

        ArrayList<Contacts> list = new ArrayList<Contacts>();

        for (int i=0; i<500; i++){
            list.add(new Contacts("hassan"+i+1, 0302445676+i));
        }


        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(new ContactAdapter(this,list));

    }
}
