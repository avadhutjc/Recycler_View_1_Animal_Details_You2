package com.masai.a7july_recycler_view_1_animal_details_you2;

import android.content.ClipData;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private ImageView mImage;
    private TextView mName;
    private TextView mType;
    private TextView mTvSound;
    private ItemClickListener itemClickListener;
    private RelativeLayout relativeLayout;


    public AnimalViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        iniViews(itemView);
    }

    private void iniViews(View itemView) {
        mImage = itemView.findViewById(R.id.ivItem);
        mName = itemView.findViewById(R.id.tvName);
        mType = itemView.findViewById(R.id.tvType);
        mTvSound  = itemView.findViewById(R.id.tvSound);
        relativeLayout = itemView.findViewById(R.id.rlCard);

//--------->when we click on image toast msg appears
//        mImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mImage.getContext(),"Item is Clicked",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void setData(Animal animal) {
        mImage.setImageResource(animal.getImage());
        mName.setText(animal.getName());
        mType.setText(animal.getType());
        mTvSound.setText(animal.getSound());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(),animal);
            }
        });
    }
}

