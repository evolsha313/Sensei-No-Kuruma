package com.example.homepage.ViewHolder;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homepage.R;

public class AdminsDTC extends AppCompatActivity {

    private Button AddNewDTCButton;
    private EditText InputDTCNumber, InputDescription, InputAdvice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admins_dtc);

        Toast.makeText(this, "Welcome Admin...", Toast.LENGTH_SHORT).show();

        AddNewDTCButton = (Button) findViewById(R.id.add_new_dtc);
        InputDTCNumber = (EditText) findViewById(R.id.add_new_dtc);
        InputDescription = (EditText) findViewById(R.id.description);
        InputAdvice = (EditText) findViewById(R.id.advice);
    }
}
