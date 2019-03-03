package com.example.loginwithpranavsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
EditText email,password;
Button login;
Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.login);
        email=findViewById(R.id.email);
        password=findViewById(R.id.passsword);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String iemail=email.getText().toString();
                String ipassword=password.getText().toString();
              //  Toast.makeText(MainActivity.this, iemail+ipassword, Toast.LENGTH_SHORT).show();


                Api api=APIClient.getRetrofitInstance().create(Api.class);
                Call<Data> call=api.getLogin(new SendData(iemail,ipassword));
                call.enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Data data1= response.body();

                           Toast.makeText(MainActivity.this, data1.getStatusMessage(), Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Failed "+t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }
}
