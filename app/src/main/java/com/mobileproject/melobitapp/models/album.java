package com.mobileproject.melobitapp.models;

import java.util.List;

public class album
{
    String name;
    List<artists> artists;
    image image;
    String releaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.mobileproject.melobitapp.models.artists> getArtists() {
        return artists;
    }

    public void setArtists(List<com.mobileproject.melobitapp.models.artists> artists) {
        this.artists = artists;
    }

    public com.mobileproject.melobitapp.models.image getImage() {
        return image;
    }

    public void setImage(com.mobileproject.melobitapp.models.image image) {
        this.image = image;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
