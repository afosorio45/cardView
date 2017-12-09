package com.materialdesing.andres.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.materialdesing.andres.cardview.R;

public class DetalleMateria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_materia);

        String titleMateria = getIntent().getStringExtra("name");
        int imageMateria = getIntent().getIntExtra("imagePoster",0);

        TextView textViewTitleMateria = findViewById(R.id.titleMateria);
        ImageView imageViewMateria = findViewById(R.id.imageViewMateria);

       textViewTitleMateria.setText(titleMateria);
       imageViewMateria.setImageResource(imageMateria);


    }
}
