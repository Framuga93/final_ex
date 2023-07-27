package org.example;

import org.example.HomeAnimals.Cat;
import org.example.HomeAnimals.Dog;
import org.example.HomeAnimals.Hamster;
import org.example.PackAnimals.Camel;
import org.example.PackAnimals.Donkey;
import org.example.PackAnimals.Horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Nursery {

    public List<Animal> animalList;

    public Nursery(){
        this.animalList = new ArrayList<>();
    }
    public void addAnimalToNursery(){
        this.animalList.add(createAnimal());
    }
    
    public Animal createAnimal(){
        String chooseAnimalHome = prompt("1.Home animal \n" +
                "2.Pack animal\n" +
                "Enter your choose: ");
        String name = prompt("Enter animal name: ");
        int age = Integer.parseInt(prompt("Enter animal age: "));
        List<String> commands = Arrays.asList(prompt("Enter commands with spacebar: ").split(" "));
        if (chooseAnimalHome.equals("1")){
           return createHomeAnimal(name, commands, age);
        }
        if (chooseAnimalHome.equals("2")){
           return createPackAnimal(name, commands, age);
        }
        System.out.println("Unknown animal type");
        return null;
    }

    private HomeAnimal createHomeAnimal(String name, List<String> commands, int age) {
        String whatAnimalCreate = prompt("1.Dog \n" +
                "2.Cat \n" +
                "3.Hamster \n");
        switch (whatAnimalCreate) {
            case "1":
                return new Dog(name, commands, age);
            case "2":
                return new Cat(name, commands, age);
            case "3":
                return new Hamster(name, commands, age);
        }
        System.out.println("Unknown animal");
        return null;
    }

    private PackAnimal createPackAnimal(String name, List<String> commands, int age) {
        String whatAnimalCreate = prompt("1.Horse \n" +
                "2.Camel \n" +
                "3.Donkey \n");
        switch (whatAnimalCreate) {
            case "1":
                return new Horse(name, commands, age);
            case "2":
                return new Camel(name, commands, age);
            case "3":
                return new Donkey(name, commands, age);
        }
        System.out.println("Unknown animal");
        return null;
    }


    public void showAnimalList(){
        for(Animal animal : this.animalList){
            System.out.println(animal);
        }
    }

    public Animal getAnimalFromList(){
        String name = prompt("Enter animal name: ");
        for(Animal animal : this.animalList){
            if (animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

