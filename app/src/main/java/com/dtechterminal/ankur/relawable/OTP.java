package com.dtechterminal.ankur.relawable;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OTP extends AppCompatActivity {
    private ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        dialog = new ProgressDialog(OTP.this);
    }
    public void Submit(View view){
        dialog.setMessage("Loading.., please wait.");
        dialog.show();
        Intent OTP = new Intent(OTP.this,UserType.class);
        startActivity(OTP);
    }
}
