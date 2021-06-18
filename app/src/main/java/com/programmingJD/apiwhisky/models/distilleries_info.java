package com.programmingJD.apiwhisky.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class distilleries_info implements Serializable {

    private String name;
    private String slug;
    private String country;
    private String whiskybase_whiskies;
    private String whiskybase_votes;
    private String whiskybase_rating;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWhiskybase_whiskies() {
        return whiskybase_whiskies;
    }

    public void setWhiskybase_whiskies(String whiskybase_whiskies) {
        this.whiskybase_whiskies = whiskybase_whiskies;
    }

    public String getWhiskybase_votes() {
        return whiskybase_votes;
    }

    public void setWhiskybase_votes(String whiskybase_votes) {
        this.whiskybase_votes = whiskybase_votes;
    }

    public String getWhiskybase_rating() {
        return whiskybase_rating;
    }

    public void setWhiskybase_rating(String whiskybase_rating) {
        this.whiskybase_rating = whiskybase_rating;
    }
}
