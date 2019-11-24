package com.example.homepage;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class diagnosepage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosepage);

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.fr3ts0n.ecu.gui.androbd");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
        else {
            // app with given package not installed not installed
        }
    }
}

