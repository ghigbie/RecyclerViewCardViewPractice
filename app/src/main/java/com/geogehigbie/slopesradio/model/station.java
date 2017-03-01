package com.geogehigbie.slopesradio.model;

/**
 * Created by georgehigbie on 2/28/17.
 */

public class station {

    final String DRAWABLE = "drawable";

    private String stationTitle;
    private String imgUri;

    public station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return imgUri;
    }
}
