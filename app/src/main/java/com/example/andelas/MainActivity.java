package com.example.andelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAbout  = findViewById(R.id.button);
        Button profile= findViewById(R.id.button3);

        final Intent profileIntent = new Intent(this,Myprofile.class);
        final Intent aboutIntent = new Intent(this,AboutAlc.class);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(profileIntent);
            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aboutIntent);

            }
        });


    }
}
