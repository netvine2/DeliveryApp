package com.example.netvine.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView etmail,etpassword,tvSignin,tvNew_user;
    private Button btnLogin;
    private String Email,Password,Login,Register,Signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etmail = findViewById(R.id.etEmail);
        etpassword = findViewById(R.id.etPassword);
        tvSignin = findViewById(R.id.tvSignin);
        tvNew_user = findViewById(R.id.tvNew_user);
        btnLogin = findViewById(R.id.btnLogin);

        Email = etmail.getText().toString().toLowerCase().trim();
        Password = etpassword.getText().toString().toLowerCase().trim();
        Signin = tvSignin.getText().toString().toLowerCase().trim();
        Register = tvNew_user.getText().toString().toLowerCase();
        Login = btnLogin.getText().toString().toLowerCase().trim();







        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();
            }
        });
    }

    private void validation() {
        if (TextUtils.isEmpty(Email)){
            etmail.setError("Type Email");
            return;
        }
        if (TextUtils.isEmpty(Password)){
            etpassword.setError("Type password");
            return;
        }
        else {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();

        }

    }
}


