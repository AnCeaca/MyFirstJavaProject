package com.company.AnimalRescuer;

public class BritishShorthair extends Cat{

    @Override
    public void speak() {
        System.out.println("Meooooow!");
    }

    @Override
    public void play() {
        System.out.println("Playing with the mouse");
    }

    @Override
    public void sleep() {
        System.out.println("ZzZz Meeeow!");
    }

    @Override
    public void eat() {
        System.out.println("YUMMMMM!");
    }
}
