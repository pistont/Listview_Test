package com.fubic.naingthu92.listview_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by naingthu92 on 2016/06/28.
 */

public class CustomListAdapter extends BaseAdapter{

    private String[] ary;
    private Context context;
    private int imgID[] = {R.drawable.tear,R.drawable.tear,R.drawable.tear,R.drawable.tear,R.drawable.tear,
            R.drawable.tear,R.drawable.tear,R.drawable.tear,R.drawable.tear,R.drawable.tear,
            R.drawable.tear,R.drawable.tear,R.drawable.tear,R.drawable.tear};

    public CustomListAdapter(Context context,String[] ary){
        this.context = context;
        this.ary = ary;
    }

    @Override
    public int getCount() {
        return ary.length;
    }

    @Override
    public Object getItem(int position) {

        return ary[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater If = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = If.inflate(R.layout.custom_list,null);
        }

        ImageView img = (ImageView)convertView.findViewById(R.id.imgview);
        TextView tvText = (TextView)convertView.findViewById(R.id.tvtext);
        img.setImageResource(imgID[position]);
        tvText.setText(ary[position]);

        return convertView;
    }
}
