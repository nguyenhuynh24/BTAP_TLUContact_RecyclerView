package com.example.tlucontact;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class DanhBaCBGVActivity extends AppCompatActivity {
    private RecyclerView rcvGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_danh_ba_cbgvactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        CBGV[] cbgvs = {
                new CBGV("Nguyen Ngoc Quynh Chau","03533333","175 Tay Son","nguyen@gmail.com","He thong thong tin","Cong nghe thong tin",R.drawable.calculator,"2231451"),
                new CBGV("Doan Thi Que","03533333","175 Tay Son","nguyen@gmail.com","Mang va an toan bao mat","Cong nghe thong tin",R.drawable.calculator,"2231451"),
                new CBGV("Nguyen Ngoc Quynh Chau","03533333","175 Tay Son","nguyen@gmail.com","He thong thong tin","Cong nghe thong tin",R.drawable.calculator,"2231451"),
                new CBGV("Nguyen Ngoc Quynh Chau","03533333","175 Tay Son","nguyen@gmail.com","He thong thong tin","Cong nghe thong tin",R.drawable.calculator,"2231451")
        };
        rcvGV = findViewById(R.id.rcvCBGV);
        CBGVAdapter myAdapter = new CBGVAdapter(cbgvs);
        rcvGV.setAdapter(myAdapter);
    }
}