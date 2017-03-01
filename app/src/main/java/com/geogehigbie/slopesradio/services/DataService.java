package com.geogehigbie.slopesradio.services;

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
}
