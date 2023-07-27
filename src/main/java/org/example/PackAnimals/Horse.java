package org.example.PackAnimals;

import org.example.PackAnimal;

import java.util.Arrays;
import java.util.List;

public class Horse extends PackAnimal {
    public Horse(String name, List<String> commands, int age) {
        super(name, commands, age);
    }

    @Override
    public String toString() {
        return "Horse, " +
                "name: '" + name + '\'' +
                ", commands it can do: " + commands.toString() +
                ", age: " + age + " " +
                "this is Pack Animal";
    }
}
