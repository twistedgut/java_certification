package com.twistedgut;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String reverseName() {
        return enamEsrever(name);
    }

    private String enamEsrever(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
