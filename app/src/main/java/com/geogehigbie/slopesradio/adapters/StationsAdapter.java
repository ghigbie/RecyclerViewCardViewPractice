package com.geogehigbie.slopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.geogehigbie.slopesradio.holders.StationViewHolder;
import com.geogehigbie.slopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by georgehigbie on 2/28/17.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder>{


    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }
}
