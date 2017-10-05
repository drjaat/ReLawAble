package com.dtechterminal.ankur.relawable;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

public class UserType extends AppCompatActivity {
    RadioButton client,lawyer;
    private ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);
        dialog = new ProgressDialog(UserType.this);
        final RadioButton client = (RadioButton) findViewById(R.id.Client);
        final RadioButton lawyer = (RadioButton) findViewById(R.id.Lawyer);
        Button button3 = (Button)findViewById(R.id.b1);

        // Register the onClick listener with the implementation above
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(client.isChecked()){
                    //spinner.setVisibility(View.VISIBLE);
                    //Toast.makeText(getApplicationContext(),"Lo",Toast.LENGTH_SHORT).show();
                    dialog.setMessage("Loading.., please wait.");
                    dialog.show();
                    Intent intent = new Intent(UserType.this,Client.class);
                    startActivity(intent);
                }else if(lawyer.isChecked()){
                    Toast.makeText(getApplicationContext(),"Lawyer hai tu",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Select kar",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
