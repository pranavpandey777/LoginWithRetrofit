package com.example.loginwithpranavsapi;


import com.google.gson.annotations.SerializedName;

public class SendData {
    @SerializedName("email")

   String email;
    @SerializedName("password")

    String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public SendData(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
