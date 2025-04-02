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

public class InfoCBGV extends AppCompatActivity {
    private ImageView imageGV;
    private TextView tvTen;
    private TextView tvsdt;
    private TextView tvdc;
    private TextView tvemail;
    private TextView tvkhoa;
    private TextView tvbomon;
    private TextView tvmagv;
    private Button btql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info_cbgv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageGV = findViewById(R.id.imagegvinfo);
        tvTen = findViewById(R.id.tv_tengv);
        tvsdt = findViewById(R.id.tv_sdtgv);
        tvdc = findViewById(R.id.tv_dcgv);
        tvemail = findViewById(R.id.tv_emailgv);
        tvkhoa = findViewById(R.id.tv_khoagv);
        tvbomon  = findViewById(R.id.tv_bomongv);
        tvmagv = findViewById(R.id.tv_magv);
        btql = findViewById(R.id.btn_qlai);
        Intent Myintent = getIntent();
        Bundle bl = Myintent.getBundleExtra("data");
        imageGV.setImageResource(bl.getInt("img"));
        tvTen.setText(bl.getString("ten"));
        tvdc.setText("Dia chi: "+bl.getString("dc"));
        tvemail.setText("Email: "+bl.getString("email"));
        tvkhoa.setText("Khoa: "+bl.getString("khoa"));
        tvbomon.setText("Bo mon: "+bl.getString("bomon"));
        tvsdt.setText("So dien thoai: "+bl.getString("sdt"));
        tvmagv.setText("Ma giang vien: "+bl.getString("magv"));
        btql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}