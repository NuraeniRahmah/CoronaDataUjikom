package com.example.coronadata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class DetailActivity2 extends AppCompatActivity {
    TextView txtumur,txtjml;
    List<Umur> kelompok_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        txtumur=(TextView)findViewById(R.id.txt_umur);
        txtjml=(TextView)findViewById(R.id.txt_jml);

        Intent dapat=getIntent();
        kelompok_umur= (List<Umur>) dapat.getSerializableExtra("terima");
    }
}