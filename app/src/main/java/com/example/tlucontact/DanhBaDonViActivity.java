package com.example.tlucontact;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class DanhBaDonViActivity extends AppCompatActivity {
    private RecyclerView rcvDonVis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_danh_ba_don_vi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        DonVi[] donVis = {
                new DonVi("Khoa Dien dien tu"," 01234556","175 Tay Son ",R.drawable.calculator,"vanphongkhoa@gmail.com","00012"),
                new DonVi("Khoa Cong nghe thong tin"," 01234556","175 Tay Son ",R.drawable.calculator,"vanphongkhoa@gmail.com","00012"),
                new DonVi("Khoa Co Khi"," 01234556","175 Tay Son ",R.drawable.calculator,"vanphongkhoa@gmail.com","00012"),
                new DonVi("Khoa Kinh te quan ly"," 01234556","175 Tay Son ",R.drawable.calculator,"vanphongkhoa@gmail.com","00012"),
        };
        rcvDonVis = findViewById(R.id.rcvDonVis);
        DonViAdapter myAdapter = new DonViAdapter(donVis);
        rcvDonVis.setAdapter(myAdapter);
    }
}