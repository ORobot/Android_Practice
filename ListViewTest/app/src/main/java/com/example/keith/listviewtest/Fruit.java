package com.example.keith.listviewtest;

/**
 * Created by keith on 7/20/16.
 */
public class Fruit {
    private String name;

    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return this.name;
    }

    public int getImageId() {
        return this.imageId;
    }
}
