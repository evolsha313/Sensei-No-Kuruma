package com.example.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homepage.ViewHolder.RegisterActivity;
import com.example.homepage.ViewHolder.loginActivity;

public class MainActivity extends AppCompatActivity {
    private Button Homepage;
    private Button joinNowButton, loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Homepage = (Button) findViewById(R.id.btnhmpg);
        Homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainpage();
            }


        });


        loginButton = (Button) findViewById(R.id.main_login_button);
        joinNowButton = (Button) findViewById(R.id.join_now_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });

        joinNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


    }

    private void openMainpage() {
        Intent intent = new Intent(this,Mainpage.class);
        startActivity(intent);




    }
}
