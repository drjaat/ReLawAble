package com.dtechterminal.ankur.relawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void proceed(View view){
        Intent OTP = new Intent(LoginPage.this,OTP.class);
        startActivity(OTP);
    }
}
