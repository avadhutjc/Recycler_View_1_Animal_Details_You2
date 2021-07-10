package com.masai.a7july_recycler_view_1_animal_details_you2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<Animal> AnimalList;
    private ItemClickListener itemClickListener;

    public AnimalAdapter(ArrayList<Animal> AnimalList,ItemClickListener itemClickListener) {
        this.AnimalList = AnimalList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("Lloyd","onCreate view holder");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new AnimalViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Log.d("Lloyd","onBind view Holder");
        Animal animal = AnimalList.get(position);
        holder.setData(animal);
    }

    @Override
    public int getItemCount() {
        return AnimalList.size();
    }
}

