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

import java.util.List;

public class DistilleriesAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<distilleries_info> myDistilleries;

    public DistilleriesAdapter(Activity activity, List<distilleries_info> distilleriesList){
        this.activity = activity;
        this.myDistilleries = distilleriesList;
    }

    @Override
    public int getCount() {
        return myDistilleries.size();
    }

    @Override
    public Object getItem(int position) {
        return myDistilleries.get(position);
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
            v = inf.inflate(R.layout.distilleries_item, null);
        }

        distilleries_info dis_info = myDistilleries.get(position);

        TextView nameDistilleries = v.findViewById(R.id.tvName);
        nameDistilleries.setText(dis_info.getName());

        return v;
    }
}
