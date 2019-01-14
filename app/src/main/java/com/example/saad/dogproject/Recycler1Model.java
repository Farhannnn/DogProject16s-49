package com.example.saad.dogproject;

public class Recycler1Model {
    public String DogName;
    public String DogDesp;

    public Recycler1Model(String dogName, String dogDesp) {
        DogName = dogName;
        DogDesp = dogDesp;
    }

    public String getDogName() {
        return DogName;
    }

    public void setDogName(String dogName) {
        DogName = dogName;
    }

    public String getDogDesp() {
        return DogDesp;
    }

    public void setDogDesp(String dogDesp) {
        DogDesp = dogDesp;
    }
}
