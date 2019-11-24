package com.example.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mainpage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        Button btn1 =(Button)findViewById(R.id.btncar);
        Button btn2 =(Button)findViewById(R.id.btnecu);
        Button btn3 =(Button)findViewById(R.id.btnhelp);
        Button btn4 =(Button)findViewById(R.id.btndig);
        Button btn5 =(Button)findViewById(R.id.btnalert);
        Button btn6 =(Button)findViewById(R.id.btnrep);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 =new Intent(Mainpage.this,carpage.class);
                startActivity(int1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 =new Intent(Mainpage.this,advice.class);
                startActivity(int2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 =new Intent(Mainpage.this,helppage.class);
                startActivity(int3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 =new Intent(Mainpage.this,diagnosepage.class);
                startActivity(int4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 =new Intent(Mainpage.this,alertpage.class);
                startActivity(int5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 =new Intent(Mainpage.this,reportpage.class);
                startActivity(int6);
            }
        });
    }



}
