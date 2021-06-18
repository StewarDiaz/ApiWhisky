package com.programmingJD.apiwhisky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.programmingJD.apiwhisky.models.distilleries_info;

public class Distilleries_Details extends AppCompatActivity {

    TextView NameDistiDetail, SlugDistiDetail, CountryDistiDetail, whiskiesDistiDetail, VotesDistiDetail, RatingDistiDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        distilleries_info DistiInfo = (distilleries_info) getIntent().getSerializableExtra("objectDistilleries");
        setContentView(R.layout.activity_distilleries__details);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        NameDistiDetail = findViewById(R.id.tvNameWhisky);
        SlugDistiDetail = findViewById(R.id.tvSlugWhisky);
        CountryDistiDetail = findViewById(R.id.tvBuyerWhisky);
        whiskiesDistiDetail = findViewById(R.id.tvSellerWhisky);
        VotesDistiDetail = findViewById(R.id.tvReserveWhisky);
        RatingDistiDetail = findViewById(R.id.tvListinWhisky);

        NameDistiDetail.setText(DistiInfo.getName());
        SlugDistiDetail.setText(DistiInfo.getSlug());
        CountryDistiDetail.setText(DistiInfo.getCountry());
        whiskiesDistiDetail.setText(DistiInfo.getWhiskybase_whiskies());
        VotesDistiDetail.setText(DistiInfo.getWhiskybase_votes());
        RatingDistiDetail.setText(DistiInfo.getWhiskybase_rating());
    }
}