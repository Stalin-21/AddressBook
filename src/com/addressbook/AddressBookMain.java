package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to the Address Book system");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter contact details: ");

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

        System.out.println("\nDisplaying all contacts:");
        addressBook.displayDetails();

        System.out.print("\nEnter the first name of the contact you want to edit: ");
        String nameToEdit = sc.nextLine();
        addressBook.editContact(nameToEdit, sc);

        System.out.print("\nEnter the first name of the contact you want to delete: ");
        String nameToDelete = sc.nextLine();
        addressBook.deleteContact(nameToDelete);
    }
}