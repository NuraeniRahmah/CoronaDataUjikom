package com.example.coronadata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    KelasBesar kelasBesar;
    List<Provinsi> listnya;
    ApiInterface apiInterface;
    RecyclerView rvcorona;
    RecyclerView.LayoutManager layoutnya;
    CoronaAdapter adapternya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvcorona=(RecyclerView)findViewById(R.id.rv_corona);
        layoutnya=new LinearLayoutManager(this);
        rvcorona.setLayoutManager(layoutnya);
        apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<KelasBesar>call=apiInterface.getDatanya();
        call.enqueue(new Callback<KelasBesar>() {
            @Override
            public void onResponse(Call<KelasBesar> call, Response<KelasBesar> response) {
                kelasBesar=response.body();
                listnya=kelasBesar.getList_data();
                adapternya=new CoronaAdapter(listnya,MainActivity.this);
                rvcorona.setAdapter(adapternya);
            }

            @Override
            public void onFailure(Call<KelasBesar> call, Throwable t) {

            }
        });

            }
}