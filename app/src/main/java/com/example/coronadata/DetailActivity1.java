package com.example.coronadata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.ClientInfoStatus;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity1 extends AppCompatActivity {
    TextView txtusia,txtjumlah,txtusia1,txtjumlah1,txtusia2,txtjumlah2,txtusia3,txtjumlah3,txtusia4,txtjumlah4,txtusia5,txtjumlah5;
    List<Umur> kelompok_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        txtusia=(TextView)findViewById(R.id.txt_usia);
        txtjumlah=(TextView)findViewById(R.id.txt_jumlah);
        txtusia1=(TextView)findViewById(R.id.txt_usia1);
        txtjumlah1=(TextView)findViewById(R.id.txt_jumlah1);
        txtusia2=(TextView)findViewById(R.id.txt_usia2);
        txtjumlah2=(TextView)findViewById(R.id.txt_jumlah2);
        txtusia3=(TextView)findViewById(R.id.txt_usia3);
        txtjumlah3=(TextView)findViewById(R.id.txt_jumlah3);
        txtusia4=(TextView)findViewById(R.id.txt_usia4);
        txtjumlah4=(TextView)findViewById(R.id.txt_jumlah4);
        txtusia5=(TextView)findViewById(R.id.txt_usia5);
        txtjumlah5=(TextView)findViewById(R.id.txt_jumlah5);

        Intent intent=getIntent();
        Provinsi dapetData= (Provinsi) intent.getSerializableExtra("terima");
        kelompok_umur=dapetData.getKelompok_umur();
        txtusia.setText(dapetData.getKelompok_umur().get(0).getKey());
        txtjumlah.setText(Integer.toString(dapetData.getKelompok_umur().get(0).getDoc_count()));
        txtusia1.setText(dapetData.getKelompok_umur().get(1).getKey());
        txtjumlah1.setText(Integer.toString(dapetData.getKelompok_umur().get(1).getDoc_count()));
        txtusia2.setText(dapetData.getKelompok_umur().get(2).getKey());
        txtjumlah2.setText(Integer.toString(dapetData.getKelompok_umur().get(2).getDoc_count()));
        txtusia3.setText(dapetData.getKelompok_umur().get(3).getKey());
        txtjumlah3.setText(Integer.toString(dapetData.getKelompok_umur().get(3).getDoc_count()));
        txtusia4.setText(dapetData.getKelompok_umur().get(4).getKey());
        txtjumlah4.setText(Integer.toString(dapetData.getKelompok_umur().get(4).getDoc_count()));
        txtusia5.setText(dapetData.getKelompok_umur().get(5).getKey());
        txtjumlah5.setText(Integer.toString(dapetData.getKelompok_umur().get(5).getDoc_count()));

    }
}