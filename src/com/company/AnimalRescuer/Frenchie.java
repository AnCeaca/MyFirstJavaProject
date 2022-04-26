package com.company.AnimalRescuer;

public class Frenchie extends Dog{

    @Override
    public void speak() {
        System.out.println("HAM-HAM!");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch!");
    }

    @Override
    public void sleep() {
        System.out.println("HamZZZZZZZzzzz");
    }

    @Override
    public void eat() {
        System.out.println("Eating sausages!");
    }
}
