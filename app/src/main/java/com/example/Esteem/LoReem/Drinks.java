package com.example.Esteem.LoReem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class Drinks extends AppCompatActivity {

    private static final String TAG="Menu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmenu);

        Log.d(TAG,"onCreate: Started.");
        ListView mListView = (ListView)findViewById(R.id.gyrosListView);


        Items gyrosChBox = new Items("Coca-Cola","5.00 zł");
        Items gyrosPr = new Items("Water","4.00 zł");


        ArrayList<Items> itemList = new ArrayList<>();

        itemList.add(gyrosChBox);
        itemList.add(gyrosPr);

        ItemListAdapter adapter = new ItemListAdapter(this, R.layout.gyros_listview,itemList);
        mListView.setAdapter(adapter);


    }
}
