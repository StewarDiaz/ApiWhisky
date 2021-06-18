
package com.programmingJD.apiwhisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.programmingJD.apiwhisky.models.whisky_info;



public class Whisky_Details extends AppCompatActivity implements View.OnClickListener {

    TextView NameWhiskyDetail, SlugWhiskyDetail, buyerWhiskyDetail, listingWhiskyDetail, sellerWhiskyDetail, reserveWhiskyDetail, baseCurrencyWhiskyDetail;
    ImageButton UrlBtn;
    String URLIr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        whisky_info WhiskyInfo = (whisky_info) getIntent().getSerializableExtra("objectWhiskys");
        setContentView(R.layout.activity_whisky__details);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        NameWhiskyDetail = findViewById(R.id.tvNameWhisky);
        SlugWhiskyDetail = findViewById(R.id.tvSlugWhisky);
        buyerWhiskyDetail = findViewById(R.id.tvBuyerWhisky);
        listingWhiskyDetail = findViewById(R.id.tvListinWhisky);
        sellerWhiskyDetail = findViewById(R.id.tvSellerWhisky);
        reserveWhiskyDetail = findViewById(R.id.tvReserveWhisky);
        baseCurrencyWhiskyDetail = findViewById(R.id.tvBaseCurrencyWhisky);
        UrlBtn = findViewById(R.id.btnUrl);

        NameWhiskyDetail.setText(WhiskyInfo.getName());
        SlugWhiskyDetail.setText(WhiskyInfo.getSlug());
        buyerWhiskyDetail.setText(WhiskyInfo.getBuyers_fee());
        listingWhiskyDetail.setText(WhiskyInfo.getListing_fee());
        sellerWhiskyDetail.setText(WhiskyInfo.getSellers_fee());
        reserveWhiskyDetail.setText(WhiskyInfo.getReserve_fee());
        baseCurrencyWhiskyDetail.setText(WhiskyInfo.getBase_currency());

        URLIr = WhiskyInfo.getUrl();

        UrlBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Uri link = Uri.parse(URLIr);
        Intent i = new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);
    }
}