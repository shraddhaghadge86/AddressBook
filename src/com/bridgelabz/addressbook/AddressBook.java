package com.bridgelabz.addressbook;

import java.util.*;

public class AddressBook {

    Contact contact = new Contact();
    // Creating array List
    static ArrayList<Contact> contactDetails = new ArrayList();
    // Taking Scanner Class Object
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, ArrayList<Contact>> hashmap = new HashMap<>();

    // method For Adding Multiple Address Book
    public static void multipleAddressBook(AddressBook addressBook) {
        System.out.println("Select the Choice:\n1. Add Address Book \n2. Search City or State.");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int selection;
                do {
                    System.out.println("Enter Name For Address Book");
                    String AddressBookName = sc.next();
//                contactsDetails.add(AddressBookName);
                    if (hashmap.containsKey(AddressBookName)) {
                        System.out.println("The AddressBook already contains");
                        break;
                    } else {
                        ArrayList<Contact> contactDetails1 = new ArrayList<>();
                        addressBook.menuChoose(addressBook, contactDetails1);
                        hashmap.put(AddressBookName,contactDetails1);
                    }
                    System.out.println("AddressBook Added" + hashmap + " ");
                    System.out.println("1. Add New Address Book \n2. Search Contact by City or State \n3. Exit");
                    selection = sc.nextInt();
                } while (selection == 1);
            case 2:
                System.out.println("Enter City or State name to search ");
                String name = sc.next();
                SearchInMultipleBook(name);
                break;
            default:
        }
    }
    //Search person in a Multiple Address book.
    private static List<Contact> SearchInMultipleBook(String name) {
        for (Map.Entry<String, ArrayList<Contact>> entry : hashmap.entrySet()) {
            for (Contact contacts : entry.getValue()) {
                if (contacts.getCity().equals(name) || contacts.getState().equals(name)) {
                    System.out.println("\nAddress Book Name :" + entry.getKey());
                    System.out.println("First Name :" + contacts.getFirstName());
                    System.out.println("Last Name :" + contacts.getLastName());
                    System.out.println("Email-ID :" + contacts.getEmailID());
                    System.out.println("Address :" + contacts.getAddress());
                    System.out.println("City Name :" + contacts.getCity());
                    System.out.println("Contact Number :" + contacts.getPhoneNumber());
                }
            }
        }

        System.out.printf("No record found:");
        return null;
    }

    public static ArrayList<Contact> addDetails(ArrayList<Contact> contactsDetails) {
        Contact info = new Contact();
        if (contactsDetails.size() == 0) {
            System.out.println("Enter the First Name");
            info.setFirstName(sc.next());
            System.out.println("Enter the Last Name");
            info.setLastName(sc.next());
            System.out.println("Enter the Address");
            info.setAddress(sc.next());
            System.out.println("Enter the city");
            info.setCity(sc.next());
            System.out.println("Enter the State");
            info.setState(sc.next());
            System.out.println("Enter the your zip Code");
            info.setZip(sc.next());
            System.out.println("Enter the Contact Number");
            info.setPhoneNumber(Long.parseLong(sc.next()));
            System.out.println("Enter the Email Id");
            info.setEmailID(sc.next());
            contactsDetails.add(info);
            System.out.println("Contact details added");
        } else {
            System.out.println("Enter first name");
            String firstName = sc.next();
            /*
             * For searching the duplicate names in arraylist
             */
            for (Contact contacts : contactsDetails) {
                // checking the duplicate name.
                if (contacts.getFirstName().equals(firstName)) {
                    System.out.println("The Name is already present.");
                    AddressBook.addDetails(contactsDetails);
                }
            }
            System.out.println("Re-enter first name");
            info.setFirstName(sc.next());
            System.out.println("Enter Last Name");
            info.setLastName(sc.next());
            System.out.println("Enter contact Number:");
            info.setPhoneNumber(Long.parseLong(sc.next()));
            System.out.println("Enter Email: ");
            info.setEmailID(sc.next());
            System.out.println("Enter Address: ");
            info.setAddress(sc.next());
            System.out.println("Enter City Name: ");
            info.setCity(sc.next());
            System.out.println("Enter State: ");
            info.setState(sc.next());
            System.out.println("Enter Zip Code:");
            info.setZip(sc.next());
            contactsDetails.add(info);
        }
        return contactsDetails;
    }

    public void displayContacts(ArrayList<Contact> contactDetails) {
        for (Contact contactDetailsValue : contactDetails) {
            System.out.println(contactDetailsValue);
            System.out.println("---------------------------");
        }
    }

    /*
     * Another method is to create editDetails Edit details you want to editing in
     * the respective information by using switch case
     */
    public void editDetails(ArrayList<Contact> contactDetails) {
        System.out.println("Enter the first name you want to edit ");
        String searchFirstName = sc.next();
        // taking for each loop
        for (Contact contact : AddressBook.contactDetails) {
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
                        System.out.println("Enter the Last Name You want to update");
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

    public void deleteContact(ArrayList<Contact> contactDetails) {
        System.out.println("Enter First Name for which you want to delete contact: ");
        String firstname = sc.next();
        Iterator<Contact> removeContact = AddressBook.contactDetails.iterator();
        /*
         * Checking the next element where condition holds true till there is single
         * element in the List using hasNext() method
         */
        while (removeContact.hasNext()) {
            /* Move cursor to next element */
            Contact nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            } else {
                System.out.println("Contact not found.");
            }
        }
    }

    public static void menuChoose(AddressBook addressBook, ArrayList<Contact> contactDetails) {
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
                    addressBook.addDetails(contactDetails);
                    break;
                case 2:
                    /* Edit contact details in address book */
                    System.out.println("Edit details");
                    addressBook.editDetails(contactDetails);
                    break;
                /* Delete contact details */
                case 3:
                    System.out.println("Delete Details");
                    addressBook.deleteContact(contactDetails);
                    break;
                /* Display contact details */
                case 4:
                    System.out.println("Display details");
                    addressBook.displayContacts(contactDetails);
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
