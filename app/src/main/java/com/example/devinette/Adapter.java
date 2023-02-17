package com.example.devinette;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Gamer> {
    private Context mCtx;
    private int resource;
    private List<Gamer> items;

    public Adapter(Context mCtx, int resource, List<Gamer> items) {
        super(mCtx, resource, items);
        this.mCtx = mCtx;
        this.resource = resource;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(resource, null);
        TextView firstName = view.findViewById(R.id.tvFirstName);
        TextView score = view.findViewById(R.id.tvScoreGamer);
        Gamer gamer = items.get(position);
        firstName.setText(gamer.getNomG());
        score.setText(String.valueOf(gamer.getScoreG()));
        return view;
    }
}
