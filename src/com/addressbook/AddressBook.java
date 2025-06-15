package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>(); // created list to store contacts.

    public void addContact(Contact contact) {    // method to add contact
        contactList.add(contact);
        System.out.println("Contact added successfully");
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
