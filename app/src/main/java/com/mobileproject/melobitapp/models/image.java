package com.mobileproject.melobitapp.models;

public class image
{
    thumbnail_small thumbnail_small;
    thumbnail thumbnail;
    cover_small cover_small;
    cover cover;

    public com.mobileproject.melobitapp.models.thumbnail_small getThumbnail_small() {
        return thumbnail_small;
    }

    public void setThumbnail_small(com.mobileproject.melobitapp.models.thumbnail_small thumbnail_small) {
        this.thumbnail_small = thumbnail_small;
    }

    public com.mobileproject.melobitapp.models.thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(com.mobileproject.melobitapp.models.thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public com.mobileproject.melobitapp.models.cover_small getCover_small() {
        return cover_small;
    }

    public void setCover_small(com.mobileproject.melobitapp.models.cover_small cover_small) {
        this.cover_small = cover_small;
    }

    public com.mobileproject.melobitapp.models.cover getCover() {
        return cover;
    }

    public void setCover(com.mobileproject.melobitapp.models.cover cover) {
        this.cover = cover;
    }
}
