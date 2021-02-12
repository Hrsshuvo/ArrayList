package com.example.arrayadaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AndroidVersion> versionArrayList;

    public CustomAdapter(Context context, ArrayList<AndroidVersion> versionsArrayList){
        this.context = context;
        this.versionArrayList = versionsArrayList;
    }
    @Override
    public int getCount() {
        if(versionArrayList != null && versionArrayList.size()>0){
            return versionArrayList.size();
        }else
        {
        return 0;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return versionArrayList.get(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.version_list_item,parent,false);
        }
        TextView txtVersionNum = view.findViewById(R.id.tv_version_number);
        TextView txtVersionName = view.findViewById(R.id.tv_version_name);
        txtVersionName.setText(versionArrayList.get(position).getVersionName());
        txtVersionNum.setText("version"+versionArrayList.get(position).getVersionNum());
        return view;
    }
}
