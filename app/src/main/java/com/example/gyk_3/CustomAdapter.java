package com.example.gyk_3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList<Person> personList;
    LayoutInflater inflater;

    public CustomAdapter(WebActivity activity, ArrayList<Person> pList){
        inflater = LayoutInflater.from(activity);
        this.personList = pList;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_list_recycler_view, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder myViewHolder, int position) {
        Person selectedPerson = personList.get(position);
        myViewHolder.setData(selectedPerson, position);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public void deletePerson(int position){
        personList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, personList.size());
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nameTxt, mediaTxt;
        ImageView personImg, deleteImg;

        public MyViewHolder(View itemView) {
            super(itemView);
            nameTxt = itemView.findViewById(R.id.person_name);
            mediaTxt = itemView.findViewById(R.id.person_social_media);
            personImg = itemView.findViewById(R.id.person_image);
            deleteImg = itemView.findViewById(R.id.deleteperson);
            deleteImg.setOnClickListener(this);
        }

        public void setData(Person selectedPerson, int position) {
            this.nameTxt.setText(selectedPerson.getUsername());
            this.mediaTxt.setText(selectedPerson.getAccountname());
            this.personImg.setImageResource(!selectedPerson.isGender() ?
                    R.drawable.man : R.drawable.woman);
        }

        @Override
        public void onClick(View v) {
            if (v == deleteImg) {
                deletePerson(getLayoutPosition());
            }
            /*if (v.getId() == R.id.deleteperson)
                deletePerson(getLayoutPosition());*/
        }
    }
}
