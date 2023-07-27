package org.example;

import java.util.Scanner;

public class View {
    public enum Commands {
        ADD_ANIMAL,
        SHOW_COMMANDS,
        SHOW_NURSERY,
        ADD_COMMAND,
        EXIT,
        NONE;

    }
    Counter counter = new Counter();
    public void run() {

        Nursery nrsr = new Nursery();
        Commands com = Commands.NONE;
        while (true) {
            try {
                String chooseMenu = prompt("Menu: \n" +
                        "add_animal - Add animal \n" +
                        "show_commands - Show animal commands \n" +
                        "show_nursery - Show animal list \n" +
                        "add_command - Add command to animal \n" +
                        "exit - Exit \n" +
                        "Enter command: ");
                com = Commands.valueOf(chooseMenu.toUpperCase());
            } catch (Exception e) {
                throw new IllegalStateException("Unknown command");
            }
            if (com == Commands.EXIT) return;
            switch (com) {
                case ADD_ANIMAL:
                    try (Counter c = counter.start()) {
                        nrsr.addAnimalToNursery();
                    }catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    continue;
                case SHOW_COMMANDS:
                    try {
                        System.out.println(nrsr.getAnimalFromList().getCommands());
                    } catch (NullPointerException e) {
                        System.out.println("Sorry we don't have animal with that name");
                    }
                    continue;
                case SHOW_NURSERY:
                    nrsr.showAnimalList();
                    continue;
                case ADD_COMMAND:
                    Animal animal = nrsr.getAnimalFromList();
                    if (animal != null) {
                        String cmd = prompt("Enter command: ");
                        animal.setCommands(cmd);
                    } else System.out.println("Sorry we don't have animal with that name");


            }
        }


    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
