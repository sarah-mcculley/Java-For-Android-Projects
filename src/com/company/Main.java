package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean getUserInput(List tasks){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("\nPlease choose an option. \n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit." );
        String userInput = scanner.nextLine();
        boolean continueLoop = true;
        switch(userInput)
        {
            case "0":
                continueLoop = false;
                break;
            case "1": addTask(tasks);
              break;
            case "2": removeTask(tasks);
                break;
            case "3": updateTask(tasks);
                break;
            case "4": listTasks(tasks);
                break;
            default:
                System.out.println("Please choose a valid option.");
        }
        return continueLoop;
    }

    static void addTask(List tasks){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter a description of the new task.");
        String newTask = scanner.nextLine();

        tasks.add(newTask);
    }

    static void removeTask(List tasks){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter the index of the task to remove.");
        String index = scanner.nextLine();

        tasks.remove(Integer.parseInt(index));

    }

    static void updateTask(List tasks){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the index of the task to update.");
        String index = scanner.nextLine();

        System.out.println("Enter the new  of the task.");
        String updatedTask = scanner.nextLine();

        tasks.set(Integer.parseInt(index), updatedTask);

    }

    static void listTasks(List<String> tasks){
        for(int i = 0; i < tasks.size(); i++ )
        {
            System.out.println(i + ". " + tasks.get(i));
        }


    }

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<String>();
        boolean continueLoop = getUserInput(tasks);
        while(continueLoop){
            continueLoop = getUserInput(tasks);

        }
    }
}
