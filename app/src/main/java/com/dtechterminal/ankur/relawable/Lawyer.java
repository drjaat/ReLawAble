package com.dtechterminal.ankur.relawable;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Lawyer extends AppCompatActivity {
    private ProgressDialog dialog;
    EditText updatefee;
    TextView presentfee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer);
        dialog = new ProgressDialog(Lawyer.this);
        updatefee = findViewById(R.id.updatefee);
        presentfee = (TextView) findViewById(R.id.amount);
    }
    public void next(View view){
        dialog.setMessage("Loading.., please wait.");
        dialog.show();
        String s1 = updatefee.getText().toString();
        presentfee.setText(s1);
    }
}
