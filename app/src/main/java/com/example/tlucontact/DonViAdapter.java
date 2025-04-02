package com.example.tlucontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DonViAdapter extends RecyclerView.Adapter<DonViAdapter.DonViViewHolder> {
    private DonVi[] donvis;
    static  class DonViViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgDonVi;
        private TextView title;
        private TextView sdt;
        private TextView dc;
        private RelativeLayout rltdv;
        public DonViViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDonVi = itemView.findViewById(R.id.img_donvi);
            sdt = itemView.findViewById(R.id.tv_sdt);
            dc = itemView.findViewById(R.id.tv_dc);
            title = itemView.findViewById(R.id.tv_title);
            rltdv = itemView.findViewById(R.id.rltdv);
        }
        public void bind(DonVi dv){
            imgDonVi.setImageResource(dv.getImgDV());
            sdt.setText(dv.getStd());
            dc.setText(dv.getDc());
            title.setText(dv.getTen());
            sdt.setText(dv.getStd());
            dc.setText(dv.getDc());
            rltdv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent MyIntent = new Intent(v.getContext(),InfoDonVi.class);
                    Bundle bl = new Bundle();
                    bl.putString("dc",dv.getDc());
                    bl.putString("ten",dv.getTen());
                    bl.putString("sdt",dv.getStd());
                    bl.putInt("img",dv.getImgDV());
                    bl.putString("email",dv.getEmail());
                    bl.putString("madv",dv.getMadv());
                    MyIntent.putExtra("data",bl);
                    v.getContext().startActivity(MyIntent);

                }
            });
        }
    }

    public DonViAdapter(DonVi[] donvis) {
        this.donvis = donvis;
    }

    @NonNull
    @Override
    public DonViViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_donvi,parent,false);
        return new DonViViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonViViewHolder holder, int position) {
        holder.bind(donvis[position]);
    }




    @Override
    public int getItemCount() {
        return donvis.length;
    }


}
