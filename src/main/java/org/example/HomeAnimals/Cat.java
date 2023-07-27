package org.example.HomeAnimals;

import org.example.HomeAnimal;

import java.util.Arrays;
import java.util.List;

public class Cat extends HomeAnimal {
    public Cat(String name, List<String> commands, int age) {
        super(name, commands, age);
    }

    @Override
    public String toString() {
        return "Cat, " +
                "name: '" + name + '\'' +
                ", commands it can do: " + commands.toString() +
                ", age: " + age + " " +
                "this is Home Animal";
    }
}
