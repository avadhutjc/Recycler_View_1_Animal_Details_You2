package com.masai.a7july_recycler_view_1_animal_details_you2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        animalList = new ArrayList<>();

        animalList.add(new Animal(R.drawable.dog3, "Type : Pet", "Sound : Bow-Bow","Name : Dog"));
        animalList.add(new Animal(R.drawable.tiger2, "Type : Wild", "Sound : Roar","Name : Tiger"));
        animalList.add(new Animal(R.drawable.cat1, "Type : Pet", "Sound : Meow-Meow","Name : Cat"));
        animalList.add(new Animal(R.drawable.snake1, "Type : Reptiles", "Sound : Hiss","Name : Snake"));
        animalList.add(new Animal(R.drawable.dog2, "Type : Pet", "Sound : Bow-Bow","Name : Dog"));
        animalList.add(new Animal(R.drawable.snake3, "Type : Reptiles", "Sound : Hiss","Name : Snake"));
        animalList.add(new Animal(R.drawable.lion2, "Type : Wild", "Sound : Roar","Name : Lion"));
        animalList.add(new Animal(R.drawable.cat2, "Type : Pet", "Sound : Meow-Meow","Name : Cat"));
        animalList.add(new Animal(R.drawable.snake2, "Type : Reptiles", "Sound : Hiss","Name : Snake"));
        animalList.add(new Animal(R.drawable.lion1, "Type : Wild", "Sound : Roar","Name : Lion"));
        animalList.add(new Animal(R.drawable.cat2, "Type : Pet", "Sound : Meow-Meow","Name : Cat"));
        animalList.add(new Animal(R.drawable.dog1, "Type : Pet", "Sound : Bow-Bow","Name : Dog"));
        animalList.add(new Animal(R.drawable.tiger1, "Type : Wild", "Sound : Roar","Name : Tiger"));
        animalList.add(new Animal(R.drawable.snake4, "Type : Reptiles", "Sound : Hiss","Name : Snake"));
        animalList.add(new Animal(R.drawable.dog4, "Type : Pet", "Sound : Bow-Bow","Name : Dog"));
        animalList.add(new Animal(R.drawable.snake3, "Type : Reptiles", "Sound : Hiss","Name : Snake"));
        animalList.add(new Animal(R.drawable.lion2, "Type : Wild", "Sound : Roar","Name : Lion"));
        animalList.add(new Animal(R.drawable.cat2, "Type : Pet", "Sound : Meow-Meow","Name : Cat"));
        animalList.add(new Animal(R.drawable.snake2, "Type : Reptiles", "Sound : Hiss","Name : Snake"));
        animalList.add(new Animal(R.drawable.lion1, "Type : Wild", "Sound : Roar","Name : Lion"));
        animalList.add(new Animal(R.drawable.cat2, "Type : Pet", "Sound : Meow-Meow","Name : Cat"));
        animalList.add(new Animal(R.drawable.dog1, "Type : Pet", "Sound : Bow-Bow","Name : Dog"));

        for (int i = 0; i < 20; i++) {
            animalList.add(new Animal(R.drawable.tiger1,"Type : Wild","Sound : Roar","Name : Tiger"));
        }

//        Animal animal = new Animal("Dog", "Bow-Bow");
//        animalList.add(animal);
//
//        Animal Animal2 = new Animal("Lion","Haaaaa");
//        animalList.add(Animal2);
//
//        for (int i = 0; i < 20; i++) {
//            Animal Animal = new Animal("Snake","Sssss");
//            animalList.add(Animal);
//        }
//
//        Animal Animal4 = new Animal("Tiger","Haaaaa");
//        animalList.add(Animal4);
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClicked(int position, Animal animal) {
        Toast.makeText(MainActivity.this,"Item Clicked at " + position + " item is " +animal.getName() ,Toast.LENGTH_SHORT).show();
    }
}