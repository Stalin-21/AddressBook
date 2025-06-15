package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book system");

        Scanner sc = new Scanner(System.in);
        Map<String, AddressBook> addressBooks = new HashMap<>();

        boolean continueRunning = true;

        while (continueRunning) {
            System.out.print("\nEnter Address Book Name: ");
            String bookName = sc.nextLine();

            AddressBook addressBook;
            if (addressBooks.containsKey(bookName)) {
                System.out.println("Opening existing Address Book: " + bookName);
                addressBook = addressBooks.get(bookName);
            } else {
                addressBook = new AddressBook();
                addressBooks.put(bookName, addressBook);
                System.out.println("Created new Address Book: " + bookName);
            }

            boolean addMore = true;
            while (addMore) {
                System.out.println("\nEnter contact details:");

                System.out.print("First Name: ");
                String firstName = sc.nextLine();
                System.out.print("Last Name: ");
                String lastName = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("City: ");
                String city = sc.nextLine();
                System.out.print("State: ");
                String state = sc.nextLine();
                System.out.print("ZIP: ");
                String zip = sc.nextLine();
                System.out.print("Phone Number: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();

                Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                addressBook.addContact(contact);

                System.out.print("Do you want to add another contact to this Address Book? (yes/no): ");
                String response = sc.nextLine();
                addMore = response.equalsIgnoreCase("yes");
            }

            System.out.println("\nDisplaying all contacts in " + bookName + ":");
            addressBook.displayDetails();

            System.out.print("\nEnter the first name of the contact you want to edit: ");
            String nameToEdit = sc.nextLine();
            addressBook.editContact(nameToEdit, sc);

            System.out.print("\nEnter the first name of the contact you want to delete: ");
            String nameToDelete = sc.nextLine();
            addressBook.deleteContact(nameToDelete);

            System.out.print("\nDo you want to switch to another Address Book? (yes/no): ");
            continueRunning = sc.nextLine().equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for using the Address Book System!");
    }
}
