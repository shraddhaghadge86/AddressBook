package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    PersonDetails contact = new PersonDetails();
    // Creating array List
    static ArrayList<PersonDetails> contactDetails = new ArrayList();
    // Taking Scanner Class Object
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, ArrayList<PersonDetails>> hashmap = new HashMap<>();

    public static void addContact(ArrayList<PersonDetails> contactDetails) {
        System.out.println("Create new contact :");
        System.out.println("======================");
        System.out.println("Enter first name:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("Enter address");
        String address = sc.next();
        System.out.println("Enter phone number");
        long  phoneNumber = sc.nextLong();
        System.out.println("Enter email ID");
        String emailID = sc.next();
        System.out.println("Enter city:");
        String city = sc.next();
        System.out.println("Enter state :");
        String state = sc.next();
        System.out.println("Enter zip code");
        String zip = String.valueOf(sc.nextLong());

        PersonDetails contact = new PersonDetails();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailID(emailID);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        displayContact(contact );
        sc.close();
    }
    public static void displayContact(PersonDetails contact) {
        System.out.println(contact);
    }

    public static void displayContacts(ArrayList<PersonDetails> contactDetails) {
        for (PersonDetails contactDetailsValue : contactDetails) {
            System.out.println(contactDetailsValue);
            System.out.println("---------------------------");
        }
    }

    /*
     * Another method is to create editDetails Edit details you want to editing in
     * the respective information by using switch case
     */
    public static void editDetails(ArrayList<PersonDetails> contactDetails) {
        System.out.println("Enter the first name you want to edit ");
        String searchFirstName = sc.next();
        // taking for each loop
        for (PersonDetails contact : AddressBook.contactDetails) {
            // taking name variable and store the first name that you want to edit
            String name = contact.getFirstName();
            // checking if condition your input first name is equal to search first name or
            // not by equals function
            System.out.println(name);
            if (name.equals(searchFirstName)) {
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City "
                        + "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                System.out.println("Enter value to update: ");
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Enter the first name You want to update");
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        // displayContacts();
                        break;
                    case 2:
                        System.out.println("Enter the Last NAme You want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        // displayContacts();
                        break;
                    case 3:
                        System.out.println("Enter the Address You want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        // displayContacts();
                        break;
                    case 4:
                        System.out.println("Enter the City You want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        // displayContacts();
                        break;
                    case 5:
                        System.out.println("Enter the State You want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        // displayContacts();
                        break;
                    case 6:
                        System.out.println("Enter the Zip code You want to update");
                        String updatedZipCode = sc.next();
                        contact.setZip(updatedZipCode);
                        // displayContacts();
                        break;
                    case 7:
                        System.out.println("Enter the Contact numberYou want to update");
                        String updatedContact = sc.next();
                        contact.setPhoneNumber(Long.parseLong(updatedContact));
                        // displayContacts();
                        break;
                    case 8:
                        System.out.println("Enter the email You want to update");
                        String updatedEmail = sc.next();
                        contact.setEmailID(updatedEmail);
                        // displayContacts();
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
                System.out.println("details updated");
            } else
                System.out.println("No record found!");
        }
    }

    public static void deleteContact(ArrayList<PersonDetails> contactDetails) {
        System.out.println("Enter First Name for which you want to delete contact: ");
        String firstname = sc.next();
        Iterator<PersonDetails> removeContact = AddressBook.contactDetails.iterator();
        /*
         * Checking the next element where condition holds true till there is single
         * element in the List using hasNext() method
         */
        while (removeContact.hasNext()) {
            /* Move cursor to next element */
            PersonDetails nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            } else {
                System.out.println("Contact not found.");
            }
        }
    }

    public static void menuChoose() {
        Scanner sc = new Scanner(System.in);
        int chooseNumber;
        do {
            System.out.println("Enter the number that you want to choose to perform the certain task");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber) {
                /* Add contact details in address book */
                case 1:
                    System.out.println("Add Details");
                    AddressBook.addContact(contactDetails);
                    break;
                case 2:
                    /* Edit contact details in address book */
                    System.out.println("Edit details");
                    AddressBook.editDetails(contactDetails);
                    break;
                /* Delete contact details */
                case 3:
                    System.out.println("Delete Details");
                    AddressBook.deleteContact(contactDetails);
                    break;
                /* Display contact details */
                case 4:
                    System.out.println("Display details");
                    AddressBook.displayContacts(contactDetails);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option choose");
                    break;
            }
        } while (chooseNumber != 5);
    }
}
