package com.abc.app.sanghoapp;

/**
 * Created by hb2002 on 2016-08-04.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends BaseAdapter{
    ArrayList<CityBean> list;
    LayoutInflater inflater;

    int[] imgs={
            R.drawable.host05,
            R.drawable.host06,
            R.drawable.host_03,
            R.drawable.host04,
            R.drawable.host07,
            R.drawable.host08,
            R.drawable.host09,
            R.drawable.host10,
            R.drawable.host_02
    };

    public CityAdapter(Context context, ArrayList<CityBean>list) {
        this.list=list;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {

        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View v, ViewGroup p) {
        ViewHolder holder;
        if(v==null){
            v = inflater.inflate(R.layout.city_list,null);
            holder = new ViewHolder();
            holder.ivphoto = (ImageView) v.findViewById(R.id.iv_photo);
            holder.tvaddr = (TextView) v.findViewById(R.id.tv_addr);
            holder.tvprice = (TextView) v.findViewById(R.id.tv_price);
            v.setTag(holder);
        }else{
            holder =(ViewHolder) v.getTag();
        }
        System.out.print("??" + list.get(i).getAddress());
        holder.ivphoto.setImageResource(imgs[i]);
        holder.tvaddr.setText(list.get(i).getAddress());
        holder.tvprice.setText(list.get(i).getPrice());

        return v;
    }
    //inner class
    static class ViewHolder{
        ImageView ivphoto;
        TextView tvaddr;
        TextView tvprice;

    }
}