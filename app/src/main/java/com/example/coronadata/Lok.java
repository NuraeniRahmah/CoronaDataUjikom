package com.example.coronadata;

public class Lok {
    private float lon;
    private float lat;

    public Lok(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}
