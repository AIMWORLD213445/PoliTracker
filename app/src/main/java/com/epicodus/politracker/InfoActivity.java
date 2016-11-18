package com.epicodus.politracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class InfoActivity extends AppCompatActivity {
    @Bind(R.id.zipView) TextView mZipView;
    @Bind(R.id.infoView) ListView mInfoView;
    @Bind(R.id.districtView) ListView mDistrictView;


    private String[] localPolInfo = new String [] {
            "Jane Doe", "John Doe", "Susan Smith", "Michael Rogers"
    };

    private String [] districtNumber = new String [] {
            "District 12","District 34","Senator","Senator"
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

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, districtNumber);
        mDistrictView.setAdapter(adapter2);

        mInfoView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
            public void onItemClick(AdapterView<?>adapterView, View view, int position, long l) {
                Toast.makeText(InfoActivity.this,"Get to know your Representatives!",Toast.LENGTH_LONG).show();
            };
        });
    }
}
