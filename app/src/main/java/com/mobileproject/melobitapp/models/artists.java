package com.mobileproject.melobitapp.models;

public class artists
{
    String id;
    int followersCount;
    String fullName;
    String type;
    String sumSongsDownloadsCount;
    image image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSumSongsDownloadsCount() {
        return sumSongsDownloadsCount;
    }

    public void setSumSongsDownloadsCount(String sumSongsDownloadsCount) {
        this.sumSongsDownloadsCount = sumSongsDownloadsCount;
    }

    public com.mobileproject.melobitapp.models.image getImage() {
        return image;
    }

    public void setImage(com.mobileproject.melobitapp.models.image image) {
        this.image = image;
    }
}

