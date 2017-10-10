package com.dtechterminal.ankur.relawable;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Client extends AppCompatActivity {
    Spinner dropdown;
    String[] items;
    private ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        dialog = new ProgressDialog(Client.this);
        dropdown = (Spinner)findViewById(R.id.spinner2);
        items = new String[]{"Corporate Lawyer", "Intellectual Property Lawyer", "Family Lawyer","Criminal Defense Lawyer","Digital Media & Internet Lawyer"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }
    public void submit(View view){
        String text = dropdown.getSelectedItem().toString();
        dialog.setMessage("Loading.., please wait.");
        dialog.show();
        Intent intent = new Intent(Client.this,LawyerList.class);
        intent.putExtra("text", text);
        startActivity(intent);

    }
}
