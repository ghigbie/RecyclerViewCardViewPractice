package com.geogehigbie.slopesradio.services;

import com.geogehigbie.slopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by georgehigbie on 3/1/17.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList <Station> getFeaturedStations(){
        //pretend we just downloaded featured stations from internet

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightPlanMusic"));
        list.add(new Station("Two-Wheeling (Biking Play List)", "bicycleMusic"));
        list.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return list;
    }

    public ArrayList <Station> getRecentStations(){
        ArrayList<Station> list = new ArrayList<>();

        return list;
    }

    public ArrayList <Station> getPartyStations(){
        ArrayList<Station> list = new ArrayList();
        list.add();

        return list;
    }
}
