package com.example.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class helppage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helppage);
        Button btncm =(Button)findViewById(R.id.btncm);
        Button btnss =(Button)findViewById(R.id.btnss);

        btncm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11 =new Intent(helppage.this,contactmac.class);
                startActivity(int11);

            }
        });

        btnss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12 =new Intent(helppage.this,specialcall.class);
                startActivity(int12);

            }
        });
    }
}
