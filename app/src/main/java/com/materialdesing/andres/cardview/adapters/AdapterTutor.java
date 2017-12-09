package com.materialdesing.andres.cardview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.materialdesing.andres.cardview.R;
import com.materialdesing.andres.cardview.models.Materia;
import com.materialdesing.andres.cardview.models.Tutor;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by andres on 8/12/17.
 */

public class AdapterTutor extends RecyclerView.Adapter<AdapterTutor.ViewHolderTutor>{

    private List<Tutor> tutor;
    private int layout;
    private OnItemClickListenerTutor itemClickListenerTutor;
    private Context context;

    public AdapterTutor(List<Tutor> tutor, int layout, AdapterTutor.OnItemClickListenerTutor listener){
        this.tutor = tutor;
        this.layout = layout;
        this.itemClickListenerTutor = listener;
    }

    @Override
    public ViewHolderTutor onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        context = parent.getContext();
        ViewHolderTutor vh = new ViewHolderTutor(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolderTutor holder, int position) {
        holder.bind(tutor.get(position),itemClickListenerTutor);
    }

    @Override
    public int getItemCount() {
        return tutor.size();
    }

    public class ViewHolderTutor extends RecyclerView.ViewHolder {

        public TextView textViewName;
       // public ImageView imageViewPoster;

        public ViewHolderTutor(View itemView){
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewTitle);
         //   imageViewPoster = (ImageView) itemView.findViewById(R.id.imageViewPoster);

        }

        public void bind(final Tutor tutor, final OnItemClickListenerTutor listener){
            //procesar datos
            textViewName.setText(tutor.getName());

           // Picasso.with(context).load(tutor.getColorResource()).fit().into(imageViewPoster);
            //imageViewPoster.setImageResource(tutor.getColorResource());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClickTutor(tutor,getAdapterPosition());
                }
            });
        }
    }


    public interface OnItemClickListenerTutor{
        void onItemClickTutor(Tutor tutor, int position);
    }


}
