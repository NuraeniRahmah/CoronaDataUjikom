package com.example.coronadata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DetailActivity extends AppCompatActivity {
    TextView txtsembuh,txtmeni,txtrawat,txtlk,txtpr,txtposi,txtsemb,txtmening;
    ImageView imgback;
    Button btnbrkt;
    Provinsi data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtsembuh=(TextView)findViewById(R.id.txt_sembuh);
        txtmeni=(TextView)findViewById(R.id.txt_meni);
        txtrawat=(TextView)findViewById(R.id.txt_rawat);
        txtlk=(TextView)findViewById(R.id.txt_lk);
        txtpr=(TextView)findViewById(R.id.txt_pr);
        txtposi=(TextView)findViewById(R.id.txt_posi);
        txtsemb=(TextView)findViewById(R.id.txt_semb);
        txtmening=(TextView)findViewById(R.id.txt_mening);
        imgback=(ImageView)findViewById(R.id.img_back);
        btnbrkt=(Button)findViewById(R.id.btn_berikut);
        Intent dapet=getIntent();
        data= (Provinsi) dapet.getSerializableExtra("kirim");
        txtsembuh.setText(Integer.toString(data.getJumlah_sembuh()));
        txtmeni.setText(Integer.toString(data.getJumlah_meninggal()));
        txtrawat.setText(Integer.toString(data.getJumlah_dirawat()));
        txtlk.setText(Integer.toString(data.getJenis_kelamin().get(0).getDoc_count()));
        txtpr.setText(Integer.toString(data.getJenis_kelamin().get(1).getDoc_count()));
        txtposi.setText(Integer.toString(data.getPenambahan().getPositif()));
        txtsemb.setText(Integer.toString(data.getPenambahan().getSembuh()));
        txtmening.setText(Integer.toString(data.getPenambahan().getMeninggal()));
        btnbrkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kirim = new Intent(DetailActivity.this, DetailActivity1.class);
                kirim.putExtra("terima", data);
                startActivity(kirim);
                finish();
            }
        });

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(DetailActivity.this,MainActivity.class);
                startActivity(pindah);
            }
        });




    }
}