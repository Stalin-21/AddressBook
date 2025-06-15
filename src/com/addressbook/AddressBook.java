package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private  List<Contact> contactList = new ArrayList<>(); // created list to store contacts.

    public void addContact(Contact contact) {    // method to add contact
        contactList.add(contact);
        System.out.println("Contact added successfully");
    }
    public void editContact(String name, Scanner sc) {
        boolean found = false;

        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Contact found. Enter new details:");

                System.out.print("New Last Name: ");
                contact.setLastName(sc.nextLine());

                System.out.print("New Address: ");
                contact.setAddress(sc.nextLine());

                System.out.print("New City: ");
                contact.setCity(sc.nextLine());

                System.out.print("New State: ");
                contact.setState(sc.nextLine());

                System.out.print("New Zip: ");
                contact.setZip(sc.nextLine());

                System.out.print("New Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());

                System.out.print("New Email: ");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        boolean found = false;

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equalsIgnoreCase(name)) {
                contactList.remove(i);
                System.out.println("Contact deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }



    public void displayDetails() {              // method to display the contact details.
       if(contactList.isEmpty()) {          // checking list is empty
           System.out.println("Contact list is empty");
       }else{
           System.out.println("All Contacts");  // If have contacts printing them with first name and last name.

           for(Contact contact : contactList) {
               System.out.println(contact.getFirstName() + " " + contact.getLastName());
           }
       }
    }
}
