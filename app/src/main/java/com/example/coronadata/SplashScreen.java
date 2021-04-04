package com.example.coronadata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {
    KelasBesar kelasBesar;
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new AmbilData().execute();
    }

    private class AmbilData extends AsyncTask<Void,Void,Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
            Call<KelasBesar>call=apiInterface.getDatanya();
            call.enqueue(new Callback<KelasBesar>() {
                @Override
                public void onResponse(Call<KelasBesar> call, Response<KelasBesar> response) {
                    kelasBesar = response.body();
                    Intent kirim = new Intent(SplashScreen.this, MainActivity.class);
                    kirim.putExtra("dataku", (Serializable) kelasBesar);
                    startActivity(kirim);
                    finish();
                }

                @Override
                public void onFailure(Call<KelasBesar> call, Throwable t) {
                    Toast.makeText(SplashScreen.this,"tidak dapat data",Toast.LENGTH_LONG).show();

                }
            });
            return null;
        }
    }
}