package com.javagotchi.ui;

import com.javagotchi.model.AnimalType;
import com.javagotchi.model.Javagotchi;

import java.util.Scanner;

public class JavagotchiApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Javagotchi adoption shop!");
        System.out.println("Please choose a Javagotchi animal to adopt :)");

        Scanner scanner = new Scanner(System.in);

        AnimalType animalType = null;
        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("Choose the type of animal: ");
            System.out.println("1. Cat");
            System.out.println("2. Dog");
            System.out.println("3. Piglet");

            int animalTypeChoice = scanner.nextInt();

            switch (animalTypeChoice) {
                case 1:
                    System.out.println("You chose to adopt a cat Javagotchi - congrats!");
                    animalType = AnimalType.CAT;
                    validChoice = true;
                    break;
                case 2:
                    System.out.println("You chose to adopt a dog Javagotchi - congrats!");
                    animalType = AnimalType.DOG;
                    validChoice = true;
                    break;
                case 3:
                    System.out.println("You chose to adopt a piglet Javagotchi - congrats!");
                    animalType = AnimalType.PIGLET;
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Enter your Javagotchi name: ");
        String name = scanner.next();

        Javagotchi javagotchi = new Javagotchi(name, animalType);
        boolean running = true;

        while (running) {
            System.out.println("Javagotchi Status:");
            System.out.println("Hunger: " + javagotchi.getHunger());
            System.out.println("Happiness: " + javagotchi.getHappiness());
            System.out.println("Health: " + javagotchi.getHealth());
            System.out.println("Choose an action: 1. Feed 2. Play 3. Give Medicine 4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    javagotchi.feed();
                    break;
                case 2:
                    javagotchi.play();
                    break;
                case 3:
                    javagotchi.giveMedicine();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            javagotchi.updateStatus();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}

