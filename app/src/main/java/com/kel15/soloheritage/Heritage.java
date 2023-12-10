package com.kel15.soloheritage;

public class Heritage {
    private String title;
    private String description;
    private int photo;
    private double latitude;
    private double longitude;

    public Heritage() {
        // Default constructor required for calls to DataSnapshot.getValue(Heritage.class)
    }

    public Heritage(String title, String description, int photo, double latitude, double longitude) {
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

