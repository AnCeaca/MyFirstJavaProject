package com.company.AnimalRescuer;

public class Animal extends LivingBeings{

    private String name;
    private int ageInMonths;
    private String color;
    private double weight;
    private String ownerName;
    private String race;
    private boolean isMale;

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

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

    public boolean getIsMale(){
        return this.isMale;
    }
    public void setIsMale(boolean isMale) {

        this.isMale = isMale;
    }

    public void speak(){
        System.out.println("sound");
    }

    public void play(){
        System.out.println("Playing");
    }

    public void sleep(){
        System.out.println("ZZzzZZzz");
    }

    public void eat(){
        System.out.println("eating");
    }













}


