package com.example.tlucontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CBGVViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageGV;
    private TextView tvTen;
    private TextView tvsdt;
    private TextView tvdc;
    private TextView tvemail;
    private RelativeLayout rltcbgv;
    public CBGVViewHolder(@NonNull View itemView) {
        super(itemView);
        imageGV = itemView.findViewById(R.id.img_cbgv);
        tvTen = itemView.findViewById(R.id.tv_title);
        tvdc = itemView.findViewById(R.id.tv_dc);
        tvemail = itemView.findViewById(R.id.tv_email);
        tvsdt = itemView.findViewById(R.id.tv_sdt);
        rltcbgv = itemView.findViewById(R.id.rlt_cbgv);


    }
    public void bind(CBGV cb){
        imageGV.setImageResource(cb.getImgGV());
        tvTen.setText(cb.getTen());
        tvemail.setText(cb.getEmail());
        tvdc.setText(cb.getDc());
        tvsdt.setText(cb.getSdt());
        rltcbgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(v.getContext(),InfoCBGV.class);
                Bundle bl = new Bundle();
                bl.putString("bomon",cb.getBomon());
                bl.putString("khoa",cb.getKhoa());
                bl.putString("dc",cb.getDc());
                bl.putString("ten",cb.getTen());
                bl.putString("sdt",cb.getSdt());
                bl.putInt("img",cb.getImgGV());
                bl.putString("email",cb.getEmail());
                bl.putString("magv",cb.getMagv());
                MyIntent.putExtra("data",bl);


                v.getContext().startActivity(MyIntent);

            }
        });
    }
}
