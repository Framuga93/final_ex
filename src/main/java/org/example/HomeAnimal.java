package org.example;

import java.util.Arrays;
import java.util.List;

public class HomeAnimal extends Animal{
    public HomeAnimal(String name, List<String> commands, int age) {
        super(name, commands, age);
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
                ", commands=" + commands.toString() +
                ", age=" + age +
                '}';
    }
}
