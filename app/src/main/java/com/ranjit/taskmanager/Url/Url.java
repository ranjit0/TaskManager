package com.ranjit.taskmanager.Url;

public class Url {

    public static final String base_url = "http://10.0.2.2:3000/";

    public static String token="";

    public static Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}