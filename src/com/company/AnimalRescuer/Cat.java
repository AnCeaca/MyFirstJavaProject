package com.company.AnimalRescuer;

public class Cat {

    private String name;
    private int ageInMonths;
    private String color;
    private double weight;
    private String ownerName;
    private String race;
    private boolean isFemale;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAgeInMonths(){
        return this.ageInMonths;
    }
    public void setAgeInMonths(int ageInMonths){
        this.ageInMonths = ageInMonths;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getOwnerName(){
        return this.ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getRace(){
        return this.race;
    }
    public void setRace(String race){
        this.race = race;
    }

    public boolean getIsFemale(){
        return this.isFemale;
    }
    public void setIsFemale(boolean isFemale) {

        this.isFemale = isFemale;
    }


    public void eat(){
        System.out.println("Eating cat food");
    }

    public void sleep(){
        System.out.println("zzzzZZZ");
    }

    public void run(){
        System.out.println("Running");
    }

    public void play(){
        System.out.println("playing");
    }
}
