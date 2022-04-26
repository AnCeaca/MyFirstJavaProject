package com.company.AnimalRescuer;

public class Dog extends Animal{

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void play() {
        System.out.println("Playing with the ball");
    }

    @Override
    public void sleep() {
        System.out.println("ZZWolfzz");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat!");
    }


}
