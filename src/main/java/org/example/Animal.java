package org.example;

import java.util.Arrays;
import java.util.List;

public class Animal {
    public String name;
    public List<String> commands;
    public  int age;

    public Animal(String name, List<String> commands, int age) {
        this.name = name;
        this.commands = commands;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(String command) {
        this.commands.add(command);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ' ' +
                ", commands=" + commands.toString() +
                ", age=" + age +
                '}';
    }
}
