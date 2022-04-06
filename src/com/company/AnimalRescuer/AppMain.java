package com.company.AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog bubble = new Dog();

        System.out.println("Dog's age is:"+ bubble.ageInMonths + "months.");
        System.out.println("Dog's colour is"+ bubble.color);
        System.out.println("Dog's name is"+ bubble.name);

        Cat fishy = new Cat();

        System.out.println("Cat's name is:"+ fishy.name);
        System.out.println("Cat's colour is:"+ fishy.color);

        Veterinarian max = new Veterinarian();
        System.out.println("Vets name is"+ max.name);
        System.out.println("Vets specialization is"+ max.specialization);

        GirlRescuer jess = new GirlRescuer();
        System.out.println("Girl's name is"+ jess.name);
        System.out.println("Girl rescuer has available for adopting"+ jess.budget + "euro.");

        BoyRescuer jake = new BoyRescuer();
        System.out.println("Boy's name is"+ jake.name);
        System.out.println("Boy rescuer has available for adopting"+ jake.budget + "euro.");

    }
}
