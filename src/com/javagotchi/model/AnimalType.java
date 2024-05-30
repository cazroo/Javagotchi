package com.javagotchi.model;

public enum AnimalType {
    CAT(70, 60, 90, "Meow!"),
    DOG(60, 70, 80, "Woof!"),
    PIGLET(50, 80, 70, "Oink!");

    // attributes
    private final int initialHunger;
    private final int initialHappiness;
    private final int initialHealth;
    private final String noise;

    // constructor
    AnimalType(int initialHunger, int initialHappiness, int initialHealth, String noise){
        this.initialHunger = initialHunger;
        this.initialHappiness = initialHappiness;
        this.initialHealth = initialHealth;
        this.noise = noise;
    }

    // getters
    public int getInitialHunger(){
        return initialHunger;
    }
    public int getInitialHappiness(){
        return initialHappiness;
    }
    public int getInitialHealth(){
        return initialHealth;
    }
    public String getNoise(){
        return noise;
    }
}

