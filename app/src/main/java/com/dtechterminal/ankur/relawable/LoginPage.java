package com.dtechterminal.ankur.relawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.dtechterminal.ankur.relawable.R.id.ADHNO;

public class LoginPage extends AppCompatActivity {
    TextView OTPfield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        OTPfield = (TextView) findViewById(R.id.ADHNO);
    }
    public void proceed(View view){
        String value =OTPfield.getText().toString();
        if(value.length()<12) {
            Toast.makeText(LoginPage.this, "AADHAAR NUMBER IS OF 12 DIGITS!!",
                    Toast.LENGTH_LONG).show();
        }
        else{
            Intent OTP = new Intent(LoginPage.this,OTP.class);
            startActivity(OTP);
        }
    }
}
