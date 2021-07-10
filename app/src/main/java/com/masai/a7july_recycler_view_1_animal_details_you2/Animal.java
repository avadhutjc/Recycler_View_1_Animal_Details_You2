package com.masai.a7july_recycler_view_1_animal_details_you2;

public class Animal {

    private int image;
    private String name;
    private String type;
    private String sound;

    public Animal(int image, String type, String sound, String name) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public int getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public String getName() {
        return name;
    }
}
