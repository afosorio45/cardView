package com.materialdesing.andres.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.materialdesing.andres.cardview.R;

public class DetalleTutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_tutor);

        String nameIntent = getIntent().getStringExtra("name");

        TextView TextViewTitle = (TextView) findViewById(R.id.title);

        TextViewTitle.setText(nameIntent);
    }
}
