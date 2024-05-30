package com.javagotchi.model;

import java.time.LocalDateTime;

public class Javagotchi {
    // attributes
    private String name;
    private int hunger;
    private int happiness;
    private int health;
    private LocalDateTime lastUpdated;

    // constructor
    public Javagotchi(String name){
        this.name = name;
        this.hunger = 50;
        this.happiness = 50;
        this.health = 100;
        this.lastUpdated = LocalDateTime.now();
    }

    public Javagotchi(String name, AnimalType animalType){
        this.name = name;
        this.hunger = animalType.getInitialHunger();
        this.happiness = animalType.getInitialHappiness();
        this.health = animalType.getInitialHealth();
        this.lastUpdated = LocalDateTime.now();
    }

    // getters & setters
    public int getHunger(){
        return hunger;
    }
    public int getHappiness(){
        return happiness;
    }
    public int getHealth(){
        return health;
    }
    public void feed(){
        hunger = Math.max(hunger - 10, 0);
        updateStatus();
    }
    public void play(){
        happiness = Math.min(happiness + 10, 100);
        updateStatus();
    }
    public void giveMedicine(){
        health = Math.min(health + 10, 100);
        updateStatus();
    }

    public void updateStatus(){
        LocalDateTime now = LocalDateTime.now();
        long minutesPassed = java.time.Duration.between(lastUpdated, now).toMinutes();

        hunger = Math.min(hunger + (int) minutesPassed, 100);
        happiness = Math.max(happiness - (int) minutesPassed, 0);
        health = (hunger < 90) ? Math.max(health - (int) minutesPassed, 0) : health;

        lastUpdated = now;
    }
}
