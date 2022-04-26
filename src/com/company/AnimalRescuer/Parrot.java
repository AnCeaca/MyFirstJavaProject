package com.company.AnimalRescuer;

public class Parrot extends Animal{

    @Override
    public void sleep() {
        System.out.println("ZzZChirp!");
    }

    @Override
    public void speak() {
        System.out.println("Whistle!Whistle!");
    }

    @Override
    public void eat() {
        System.out.println("Eating seeds!");
    }

    @Override
    public void play() {
        System.out.println("Flying around!");
    }
}
