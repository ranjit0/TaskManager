package com.ranjit.taskmanager.UsersAPI;

public interface UsersAPI {

    @POST("users/signup")
    Call<SignUpResponse>
}
