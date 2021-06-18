package com.programmingJD.apiwhisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.programmingJD.apiwhisky.ApiManager.RetrofitClient;
import com.programmingJD.apiwhisky.adapters.WhiskyAdapter;
import com.programmingJD.apiwhisky.models.whisky_info;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class whisky extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listWhis;

    List<whisky_info> Listwhis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listWhis = findViewById(R.id.lvWhisky);
        getFromWhiski();
        listWhis.setOnItemClickListener(this);
    }

    private void getFromWhiski(){
        Call<List<whisky_info>> callingWhis = RetrofitClient.getInstance().getMyApy().getAuctions_info_list();
        callingWhis.enqueue(new Callback<List<whisky_info>>() {
            @Override
            public void onResponse(Call<List<whisky_info>> call, Response<List<whisky_info>> response) {
                if(response.isSuccessful()){
                    Listwhis = response.body();
                    WhiskyAdapter adapter = new WhiskyAdapter(whisky.this, Listwhis);
                    listWhis.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<List<whisky_info>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error de red", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this, Whisky_Details.class);
        in.putExtra("objectWhiskys", Listwhis.get(position));
        startActivity(in);
    }
}