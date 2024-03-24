package com.example.tp_2_2024.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tp_2_2024.R;
import com.example.tp_2_2024.model.RealEstate;

import java.util.List;

public class RealEstateAdapter extends ArrayAdapter<RealEstate> {

    private Context context;
    private List<RealEstate> list;
    private LayoutInflater lInflater;

    public RealEstateAdapter(@NonNull Context context, int resource, @NonNull List<RealEstate> objects, LayoutInflater lInflator) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.lInflater = lInflator;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = lInflater.inflate(R.layout.list_item, parent, false);
        }

        RealEstate itemToShow = list.get(position);

        ((ImageView) view.findViewById(R.id.imageView)).setImageResource(itemToShow.getImage());
        ((TextView) view.findViewById(R.id.locationLabel)).setText(itemToShow.getLocation());
        ((TextView) view.findViewById(R.id.priceLabel)).setText("$"+itemToShow.getPrice());

        return view;
    }
}
