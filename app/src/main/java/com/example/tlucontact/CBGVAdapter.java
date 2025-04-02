package com.example.tlucontact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CBGVAdapter extends RecyclerView.Adapter<CBGVViewHolder> {
    CBGV[] cbgv;

    public CBGVAdapter(CBGV[] cbgv) {
        this.cbgv = cbgv;
    }

    @NonNull
    @Override
    public CBGVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_cbgv,parent,false);
        return new CBGVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CBGVViewHolder holder, int position) {
        holder.bind(cbgv[position]);
    }

    @Override
    public int getItemCount() {
        return cbgv.length;
    }
}