package com.company.AnimalRescuer;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Miau!");
    }

    @Override
    public void play() {
        System.out.println("Playing catch it!");
    }

    @Override
    public void sleep() {
        System.out.println("ZZzzMeoooow!");
    }

    @Override
    public void eat() {
        System.out.println("Eating cat food");
    }

    public void run(){
        System.out.println("Running");
    }












}
