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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.editTextZIP)
    EditText mEditTextZIP;
    @Bind(R.id.buttonZIP)
    Button mButtonZIP;
    @Bind(R.id.textAbout)
    TextView mAboutView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButtonZIP.setOnClickListener(this);
        mAboutView.setOnClickListener(this);
    }


        @Override
        public void onClick (View v){
            if (v == mAboutView) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
            if (v == mButtonZIP) {
                String zip = mEditTextZIP.getText().toString();
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("zip", zip);
                startActivity(intent);
            }
        }
    }


