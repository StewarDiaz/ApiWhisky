package com.programmingJD.apiwhisky.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.programmingJD.apiwhisky.R;
import com.programmingJD.apiwhisky.models.distilleries_info;
import com.programmingJD.apiwhisky.models.whisky_info;

import java.util.List;

public class WhiskyAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<whisky_info> myWhisky;

    public WhiskyAdapter(Activity activity, List<whisky_info> WhiskyList){
        this.activity = activity;
        this.myWhisky = WhiskyList;
    }

    @Override
    public int getCount() {
        return myWhisky.size();
    }

    @Override
    public Object getItem(int position) {
        return myWhisky.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.whisky_item, null);
        }

        whisky_info whis_info = myWhisky.get(position);

        TextView nameDistilleries = v.findViewById(R.id.tvNameWhi);
        nameDistilleries.setText(whis_info.getName());

        return v;
    }

}

