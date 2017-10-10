package com.dtechterminal.ankur.relawable;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LawyerList extends AppCompatActivity {
    String text;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer_list);
        dialog = new ProgressDialog(LawyerList.this);
        Bundle bundle = getIntent().getExtras();
        text = bundle.getString("text");
    }
    public void next(View view){
        dialog.setMessage("Loading.., please wait.");
        dialog.show();
        startActivity(new Intent(LawyerList.this,LawyerList.class ));
    }
}
