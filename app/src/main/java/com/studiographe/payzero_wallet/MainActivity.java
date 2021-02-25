package com.studiographe.payzero_wallet;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridview1, gridView2;
    // Create a new Array of type HashMap
    private ArrayList<HashMap<String, Object>> maplist = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> maplist1 = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        gridview1 = (GridView) findViewById(R.id.mainGridView1);
        gridView2 = (GridView) findViewById(R.id.mainGridView2);


        // Add items to the Map list1
        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "mobile");
            _item.put("icon", R.drawable.ic_smartphone__1_);
            maplist.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Mediclim");
            _item.put("icon", R.drawable.ic_health_insurance);
            maplist.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "DTH");
            _item.put("icon", R.drawable.ic_radio_antenna);
            maplist.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Electricity");
            _item.put("icon", R.drawable.ic_light_bulb);
            maplist.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Challan");
            _item.put("icon", R.drawable.ic_traffic_lights);
            maplist.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Scan & Pay");
            _item.put("icon", R.drawable.ic_qr_code_scan);
            maplist.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "BHIM UPI");
            _item.put("icon", R.drawable.ic_upi_icon);
            maplist.add(_item);
        }


        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Metro");
            _item.put("icon", R.drawable.ic_train);
            maplist.add(_item);
        }

        GridAdapter adapter = new GridAdapter(this);
        gridview1.setAdapter(adapter);

        //grideview2
        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Groseries");
            _item.put("icon", R.drawable.ic_shopping_cart);
            maplist1.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Electronics");
            _item.put("icon", R.drawable.ic_desktop);
            maplist1.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Men's Fashion");
            _item.put("icon", R.drawable.ic_t_shirt__1_);
            maplist1.add(_item);
        }

        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Women's Fashion");
            _item.put("icon", R.drawable.ic_tshirt);
            maplist1.add(_item);
        }
        GridAdapter1 adapter1 = new GridAdapter1(this);
        gridView2.setAdapter(adapter1);











        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public class GridAdapter extends BaseAdapter{
        private Context mContext;
        public GridAdapter(Context c) {
            mContext = c;
        }

        @Override
        public int getCount() {
            return maplist.size();        }

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
            LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (v == null) {
                v = _inflater.inflate(R.layout.list_item, null);
            }
            // Get the TextView and ImageView from CustomView for displaying item
            TextView txtview = (TextView) v.findViewById(R.id.listitemTextView1);
            ImageView imgview = (ImageView) v.findViewById(R.id.listitemImageView1);

            // Set the text and image for current item using data from map list
            txtview.setText(maplist.get(position).get("title").toString());
            imgview.setImageResource((Integer) maplist.get(position).get("icon"));
            return v;

        }
    }





}