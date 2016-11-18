package com.epicodus.politracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.editTextZIP) EditText mEditTextZIP;
    @Bind(R.id.buttonZIP) Button mButtonZIP;
    @Bind(R.id.textAbout) TextView mAboutView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAboutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mButtonZIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zip = mEditTextZIP.getText().toString();
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("zip", zip);
                startActivity(intent);
            }

        });
    }
}