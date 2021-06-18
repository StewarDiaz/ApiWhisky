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
import com.programmingJD.apiwhisky.adapters.DistilleriesAdapter;
import com.programmingJD.apiwhisky.models.distilleries_info;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class destilerias extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listDisti;

    List<distilleries_info> retList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destilerias);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listDisti = findViewById(R.id.lvDistilleries);
        getFromDistilleries();
        listDisti.setOnItemClickListener(this);

    }

    private void getFromDistilleries(){
        Call<List<distilleries_info>> callingDisti = RetrofitClient.getInstance().getMyApy().getDistilleries_info_list();
        callingDisti.enqueue(new Callback<List<distilleries_info>>() {
            @Override
            public void onResponse(Call<List<distilleries_info>> call, Response<List<distilleries_info>> response) {
                if(response.isSuccessful()){
                    retList = response.body();
                    DistilleriesAdapter adapter = new DistilleriesAdapter(destilerias.this, retList);
                    listDisti.setAdapter(adapter);
                }              
            }

            @Override
            public void onFailure(Call<List<distilleries_info>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error de red", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this, Distilleries_Details.class);
        in.putExtra("objectDistilleries", retList.get(position));
        startActivity(in);
    }
}