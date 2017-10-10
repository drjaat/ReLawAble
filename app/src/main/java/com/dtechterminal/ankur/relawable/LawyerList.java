package com.dtechterminal.ankur.relawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LawyerList extends AppCompatActivity {
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer_list);
        Bundle bundle = getIntent().getExtras();
        text = bundle.getString("text");
    }
}
