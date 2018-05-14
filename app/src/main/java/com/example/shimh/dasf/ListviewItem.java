package com.example.shimh.dasf;

import android.graphics.drawable.Drawable;

/**
 * Created by shimh on 2018-05-14.
 */

public class ListviewItem {
String name;
String artist;
Drawable image;

    public Drawable getImage() {
        return image;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}

