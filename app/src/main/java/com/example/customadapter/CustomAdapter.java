package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String cityList[];
    int symbols[];
    String capitalCities[];
    TextView city;
    ImageView symbol;
    TextView capital;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] cityList, int[] symbols, String[] capitals) {
        this.context = applicationContext;
        this.cityList = cityList;
        this.symbols = symbols;
        this.capitalCities = capitals;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner, null);
        city = (TextView) view.findViewById(R.id.tV);
        symbol = (ImageView) view.findViewById(R.id.iV);
        capital = (TextView) view.findViewById(R.id.tV2);
        city.setText(cityList[i]);
        symbol.setImageResource(symbols[i]);
        capital.setText(capitalCities[i]);
        return view;
    }
}
