package com.ethanhua.skeleton.sample.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;


public class SimpleRcvViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> views = new SparseArray<View>();

    public SimpleRcvViewHolder(View itemView) {
        super(itemView);
    }

    @SuppressWarnings("unchecked")
    public <V extends View> V getView(int resId) {
        View v = views.get(resId);
        if (null == v) {
            v = itemView.findViewById(resId);
            views.put(resId, v);
        }
        return (V) v;
    }
}