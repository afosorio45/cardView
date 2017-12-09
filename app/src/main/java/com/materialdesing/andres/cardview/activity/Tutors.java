package com.materialdesing.andres.cardview.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.materialdesing.andres.cardview.R;
import com.materialdesing.andres.cardview.adapters.AdapterTutor;
import com.materialdesing.andres.cardview.adapters.MyAdapter;
import com.materialdesing.andres.cardview.models.Materia;
import com.materialdesing.andres.cardview.models.Tutor;

import java.util.ArrayList;
import java.util.List;

public class Tutors extends AppCompatActivity {

    private List<Tutor> tutor;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor);

        tutor = this.getAllTutor();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_tutor);
        mLayoutManager = new LinearLayoutManager(this);

        mAdapter = new AdapterTutor(tutor ,R.layout.recycler_view_item_tutor, new AdapterTutor.OnItemClickListenerTutor(){


            @Override
            public void onItemClickTutor(Tutor tutor, int position) {
                Toast.makeText(Tutors.this, "hola:"+tutor.getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Tutors.this,DetalleTutor.class);

                intent.putExtra("name",tutor.getName());

                startActivity(intent);

            }
        });


         mRecyclerView.setLayoutManager(mLayoutManager);
         mRecyclerView.setAdapter(mAdapter);
    }


    private List<Tutor> getAllTutor(){
        return new ArrayList<Tutor>(){{
            add(new Tutor("Leo"));
            add(new Tutor("Francisco"));
            add(new Tutor("tatiana"));
            add(new Tutor("juan"));
            add(new Tutor("carolina"));
            add(new Tutor("laura"));
            add(new Tutor("hanna"));
            add(new Tutor("valentina"));
            add(new Tutor("pedro"));




        }};
    }
}
