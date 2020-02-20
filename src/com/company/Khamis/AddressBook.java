package com.company.Khamis;


/*
Create a class that represents contact information for a person. The class should store the person's name
and their email address.

Create a second class that represents an address book (a collection of contact information for many people) that
includes methods for adding new contact information and for searching the existing collection for a contacts email
address when the name is specified.

The program should create instances of the classes and demonstrate the functionality.
*/

import java.util.*;
public class AddressBook {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Person person1 = new Person("yuniskhamis108@gmail.com", "y");
        // Person person2 = new Person("112609@swcsd.us", "s");
        Map<String, String> address = new HashMap<>();

        showMainMenu();
        // addPerson();
        //  searchPerson(address);
        System.out.println(address);

    }
    private static void showMainMenu() {
        System.out.println("1. Add person");
        //System.out.println("2. Find person");
        // System.out.println("3. Show all contacts");
        System.out.println("2. Close program");

        String choice;
        do {
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    addPerson();
                    break;
                case "2":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter number from 1 to 2");
            }
        } while (true);
    }

    public static void addPerson() {
        Map<String, String> address = new HashMap<>();
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter email: ");
        String email = input.nextLine();
        Person person = new Person(name, email);
        address.put(person.getName(), person.getEmail());
        System.out.println(address);
        searchPerson(address);
        //showMainMenu();
    }

    public static void searchPerson(Map<String, String> a) {
        while (true) {

            System.out.println("Who would you like to search for: ");
            String name = input.nextLine();
            a.get(name);
            System.out.println("The email of the contact is " + a.get(name));

        }
    }
}



