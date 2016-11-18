package com.epicodus.politracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class InfoActivity extends AppCompatActivity {
    @Bind(R.id.zipView) TextView mZipView;
    @Bind(R.id.infoView) ListView mInfoView;

    private String[] localPolInfo = new String [] {
            "Jane Doe", "Jahn Doe", "Susan Smith", "Michael Rogers"
    };
    private Integer [] districtNumber = new Integer [] {
            12,34,6,8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String zip = intent.getStringExtra("zip");
        mZipView.setText("Political representatives near ZIP code " + zip +" include:" );
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, localPolInfo);
        mInfoView.setAdapter(adapter);

    }
}
