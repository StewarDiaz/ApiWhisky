package com.programmingJD.apiwhisky.models;
import java.io.Serializable;
import java.util.List;

public class whisky_info implements Serializable {

    private String name;
    private String slug;
    private String url;
    private String buyers_fee;
    private String sellers_fee;
    private String reserve_fee;
    private String listing_fee;
    private String base_currency;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBuyers_fee() {
        return buyers_fee;
    }

    public void setBuyers_fee(String buyers_fee) {
        this.buyers_fee = buyers_fee;
    }

    public String getSellers_fee() {
        return sellers_fee;
    }

    public void setSellers_fee(String sellers_fee) {
        this.sellers_fee = sellers_fee;
    }

    public String getReserve_fee() {
        return reserve_fee;
    }

    public void setReserve_fee(String reserve_fee) {
        this.reserve_fee = reserve_fee;
    }

    public String getListing_fee() {
        return listing_fee;
    }

    public void setListing_fee(String listing_fee) {
        this.listing_fee = listing_fee;
    }

    public String getBase_currency() {
        return base_currency;
    }

    public void setBase_currency(String base_currency) {
        this.base_currency = base_currency;
    }
}
