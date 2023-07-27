package org.example.HomeAnimals;

import org.example.HomeAnimal;

import java.util.Arrays;
import java.util.List;

public class Dog extends HomeAnimal {
    public Dog(String name, List<String> commands, int age) {
        super(name, commands, age);
    }

    @Override
    public String toString() {
        return "Dog, " +
                "name: '" + name + '\'' +
                ", commands it can do: " + commands.toString() +
                ", age: " + age + " " +
                "this is Home Animal";
    }
}
