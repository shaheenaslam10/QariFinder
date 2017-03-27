package com.example.shani.qarifinder.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shani.qarifinder.QariData;
import com.example.shani.qarifinder.R;

import java.util.ArrayList;

/**
 * Created by Shani on 3/24/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    ArrayList<QariData> qariDatas = new ArrayList<QariData>();

    public RecyclerAdapter(ArrayList<QariData> qariDatas) {
        this.qariDatas = qariDatas;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_row,parent,false);
        RecyclerHolder recyclerHolder = new RecyclerHolder(view);
        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
            QariData qariData = qariDatas.get(position);
        holder.textView.setText(qariData.getText());
        holder.imageView.setImageResource(qariData.getImage());
    }

    @Override
    public int getItemCount() {
        return qariDatas.size();
    }
    public class RecyclerHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        public RecyclerHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.row_title);
            imageView = (ImageView)itemView.findViewById(R.id.row_Image);
        }
    }
}
