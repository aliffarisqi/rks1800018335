package com.example.myapp.kelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.myapp.Home;
import com.example.myapp.R;

public class KelasHome extends AppCompatActivity {
    RelativeLayout btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_home);
        btn1 = findViewById(R.id.rl_senin);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(KelasHome.this, KelasDay.class);
                startActivity(inte);
            }
        });
    }
}
