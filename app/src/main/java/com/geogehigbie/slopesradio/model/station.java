package com.geogehigbie.slopesradio.model;

/**
 * Created by georgehigbie on 2/28/17.
 */

public class station {

    final String DRAWABLE = "drawable";
    private String stationTitle;
    private String imgUri;

    public station(String imgUri, String stationTitle) {
        this.imgUri = imgUri;
        this.stationTitle = stationTitle;
    }

    public String getImgUri() {
        return imgUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }
}
