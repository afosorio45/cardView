package com.materialdesing.andres.cardview.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.materialdesing.andres.cardview.R;
import com.materialdesing.andres.cardview.adapters.MyAdapter;
import com.materialdesing.andres.cardview.models.Materia;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Materia> materia;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materia = this.getAllMovies();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(materia, R.layout.recycler_view_item, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Materia materias, int position) {

                Intent intent = new Intent(MainActivity.this,DetalleMateria.class);

                intent.putExtra("name",materias.getName());
                intent.putExtra("imagePoster",materias.getPoster());

                startActivity(intent);
            }
        });

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

    private List<Materia> getAllMovies(){
        return new ArrayList<Materia>(){{
            add(new Materia("Matematicas",R.drawable.logo));
            add(new Materia("Fisica",R.drawable.logo1));
            add(new Materia("Ingles",R.drawable.logo2));
            add(new Materia("Lectura",R.drawable.logo3));
            add(new Materia("Escritura",R.drawable.logo3));
            add(new Materia("Filosofia",R.drawable.logo3));
            add(new Materia("Pintura",R.drawable.logo3));

        }};
    }
}

