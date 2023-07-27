package org.example.HomeAnimals;

import org.example.HomeAnimal;

import java.util.Arrays;
import java.util.List;

public class Hamster extends HomeAnimal {
    public Hamster(String name, List<String> commands, int age) {
        super(name, commands, age);
    }

    @Override
    public String toString() {
        return "Hamster, " +
                "name: '" + name + '\'' +
                ", commands it can do: " + commands.toString() +
                ", age: " + age + " " +
                "this is Home Animal";
    }
}
