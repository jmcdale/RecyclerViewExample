package com.jmcdale.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewStringListAdapter extends RecyclerView.Adapter<RecyclerViewStringListAdapter.ViewHolder> {

    private List<String> strings;

    public RecyclerViewStringListAdapter(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.li_adjective, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.tvText.setText(strings.get(position));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;
        TextView tvText;

        public ViewHolder(View itemView) {
            super(itemView);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
            tvText = (TextView) itemView.findViewById(R.id.tvText);
        }
    }

}
