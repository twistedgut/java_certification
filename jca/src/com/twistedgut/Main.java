package com.twistedgut;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("lion");
        System.out.println(lion.getName());

        lion.setName("antelope");
        System.out.println(lion.getName());

        System.out.println(lion.reverseName());

        Animal dog = new Animal("wolf dog");
        System.out.println(dog.getName());
        System.out.println(dog.reverseName());


    }

}
