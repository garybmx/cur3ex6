package com.example.cur3ex6;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myAdapterViewHolder> {

    List<String> myList = new ArrayList<>();

    myAdapter(){
        myList.add("Odin");
        myList.add("Dva");
        myList.add("Tri");
        myList.add("Odin");
        myList.add("Dva");
        myList.add("Tri");
        myList.add("Odin");
        myList.add("Dva");
        myList.add("Tri");
        myList.add("Odin");
        myList.add("Dva");
        myList.add("Tri");
        myList.add("Odin");
        myList.add("Dva");
        myList.add("Tri");
        myList.add("Odin");
        myList.add("Dva");
        myList.add("Tri");
    }

    @NonNull
    @Override
    public myAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_row, viewGroup, false);
        return new myAdapterViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull myAdapterViewHolder myAdapterViewHolder, int i) {
        myAdapterViewHolder.text.setText(myList.get(i));
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public static class myAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        CardView cv;

        myAdapterViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            text = (TextView)itemView.findViewById(R.id.cvElement);

        }
    }
}
