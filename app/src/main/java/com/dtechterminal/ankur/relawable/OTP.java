package com.dtechterminal.ankur.relawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
    }
    public void Submit(View view){
        Intent OTP = new Intent(OTP.this,UserType.class);
        startActivity(OTP);
    }
}
