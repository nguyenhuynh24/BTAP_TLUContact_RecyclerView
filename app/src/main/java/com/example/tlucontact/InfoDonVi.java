package com.example.tlucontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoDonVi extends AppCompatActivity {

    private ImageView imagedv;
    private TextView tvTen;
    private TextView tvsdt;
    private TextView tvdc;
    private TextView tvemail;

    private TextView tvmadv;
    private Button btql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info_don_vi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imagedv = findViewById(R.id.imagedvinfo);
        tvTen = findViewById(R.id.tv_tendv);
        tvsdt = findViewById(R.id.tv_sdtdv);
        tvdc = findViewById(R.id.tv_dcdv);
        tvemail = findViewById(R.id.tv_emaildv);

        tvmadv = findViewById(R.id.tv_madv);
        btql = findViewById(R.id.btn_qlai);
        Intent Myintent = getIntent();
        Bundle bl = Myintent.getBundleExtra("data");
        imagedv.setImageResource(bl.getInt("img"));
        tvTen.setText(bl.getString("ten"));
        tvdc.setText("Dia chi: "+bl.getString("dc"));
        tvemail.setText("Email: "+bl.getString("email"));
        tvsdt.setText("So dien thoai: "+bl.getString("sdt"));
        tvmadv.setText("Ma don vi: "+bl.getString("madv"));
        btql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}