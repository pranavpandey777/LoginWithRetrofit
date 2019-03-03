package com.example.loginwithpranavsapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    String BaseUrl="https://form420.000webhostapp.com/";

    @POST("login")
    Call<Data> getLogin(@Body SendData sendData);
//   Call<Data> getLogin(@Body SendData sendData);
}
