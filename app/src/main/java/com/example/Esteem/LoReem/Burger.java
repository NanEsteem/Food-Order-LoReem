package com.example.Esteem.LoReem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class Burger extends AppCompatActivity {

    private static final String TAG="Menu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmenu);

        Log.d(TAG,"onCreate: Started.");
        ListView mListView = (ListView)findViewById(R.id.gyrosListView);

        Items pitaCh = new Items("Burger","10.00 zł");
        Items pitapr = new Items("Pizza","22.00 zł");
        Items gyroGreekSalad = new Items("Kebab","13.00 zł");
        Items gyrochGreekSalad = new Items("Shoarma","25.00 zł");
        Items gyrosgf = new Items("Chips","8.50 zł");
        Items gyrosprgf = new Items("Sauce","4.00 zł");
        Items gyrosChBox = new Items("Coca-Cola","5.00 zł");
        Items gyrosPr = new Items("Water","4.00 zł");


        ArrayList<Items> itemList = new ArrayList<>();
        itemList.add(pitaCh);
        itemList.add(pitapr);
        itemList.add(gyrochGreekSalad);
        itemList.add(gyroGreekSalad);
        itemList.add(gyrochGreekSalad);
        itemList.add(gyrosgf);
        itemList.add(gyrosprgf);
        itemList.add(gyrosChBox);
        itemList.add(gyrosPr);

        ItemListAdapter adapter = new ItemListAdapter(this, R.layout.gyros_listview,itemList);
        mListView.setAdapter(adapter);


    }
}
