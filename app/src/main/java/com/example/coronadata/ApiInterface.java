package com.example.coronadata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("prov.json")
    Call<KelasBesar> getDatanya();
}
