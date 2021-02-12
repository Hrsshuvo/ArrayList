package com.example.arrayadaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        CustomAdapter adapter = new CustomAdapter(this,getAndroidVersion());
        listView.setAdapter(adapter);

        /* ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.android_versions));
        listView.setAdapter(adapter);

         */
    }
    private ArrayList<AndroidVersion> getAndroidVersion()
    {
        AndroidVersion version = new AndroidVersion();
        version.setVersionNum(4.1);
        version.setVersionName("Lolipop");

        AndroidVersion version1 = new AndroidVersion();
        version1.setVersionNum(4.2);
        version1.setVersionName("Kitkat");

        AndroidVersion version2 = new AndroidVersion();
        version2.setVersionNum(4.3);
        version2.setVersionName("Marsmello");

        AndroidVersion version3 = new AndroidVersion();
        version3.setVersionNum(4.4);
        version3.setVersionName("Orio");

        AndroidVersion version4 = new AndroidVersion();
        version4.setVersionNum(4.5);
        version4.setVersionName("Nugat");

        AndroidVersion version5 = new AndroidVersion();
        version5.setVersionNum(4.6);
        version5.setVersionName("Pie");

        ArrayList<AndroidVersion> versionArrayList = new ArrayList<>();
        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version5);

        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version5);

        versionArrayList.add(version);
        versionArrayList.add(version1);
        versionArrayList.add(version2);
        versionArrayList.add(version3);
        versionArrayList.add(version4);
        versionArrayList.add(version5);

        return versionArrayList;
    }
}