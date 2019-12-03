package com.tetris.main;


import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;





public class ApiClient {
	private static Retrofit retrofit = null;

    public static Retrofit getClient_aws() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://" + IPClass.ServerIp + "/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
