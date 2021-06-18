package com.programmingJD.apiwhisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.programmingJD.apiwhisky.ApiManager.RetrofitClient;
import com.programmingJD.apiwhisky.models.distilleries_info;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void StarDistilleries(View v){
        Intent indisti = new Intent(this, destilerias.class);
        startActivity(indisti);
    }

    public void StarWhisky(View v){
        Intent inwhisky = new Intent(this, whisky.class);
        startActivity(inwhisky);
    }

}