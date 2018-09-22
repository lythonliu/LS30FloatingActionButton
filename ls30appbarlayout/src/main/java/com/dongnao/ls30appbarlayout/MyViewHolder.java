package com.dongnao.ls30appbarlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/12.
 */

class MyViewHolder extends RecyclerView.ViewHolder {
    TextView mTextView;
    public MyViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.item_tv);
    }
}