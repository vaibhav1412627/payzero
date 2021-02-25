package com.studiographe.payzero_wallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class GridAdapter1 extends BaseAdapter {
    private ArrayList<HashMap<String, Object>> maplist1 = new ArrayList<>();

    private Context mContext;

    public GridAdapter1(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return maplist1.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        // Inflate the layout for each list item
        LayoutInflater _inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (v == null) {
            v = _inflater.inflate(R.layout.list_item, null);
        }
        // Get the TextView and ImageView from CustomView for displaying item
        TextView txtview = (TextView) v.findViewById(R.id.listitemTextView1);
        ImageView imgview = (ImageView) v.findViewById(R.id.listitemImageView1);

        // Set the text and image for current item using data from map list
        txtview.setText(maplist1.get(position).get("title").toString());
        imgview.setImageResource((Integer) maplist1.get(position).get("icon"));
        return v;

    }

}
