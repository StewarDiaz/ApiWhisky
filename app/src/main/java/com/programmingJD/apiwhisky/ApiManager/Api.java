package com.programmingJD.apiwhisky.ApiManager;

import com.programmingJD.apiwhisky.models.distilleries_info;
import com.programmingJD.apiwhisky.models.whisky_info;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    String BASE_URL = "https://whiskyhunter.net/api/";

    @GET("distilleries_info")
    Call <List<distilleries_info>> getDistilleries_info_list();

    @GET("auctions_info")
    Call <List<whisky_info>> getAuctions_info_list();
}
