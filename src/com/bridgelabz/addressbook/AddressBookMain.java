package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        int choice = 10, count = 0;
        System.out.println("Welcome in AddressBook");
        AddressBook add = new AddressBook();
        Scanner sc = new Scanner(System.in);
        ArrayList<Data> contact = new ArrayList<Data>();
        while (choice != 0) {
            System.out.println("Press bellow option");
            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Display contacts");
            System.out.println(" 4. Delete contacts");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print(" Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Surname: ");
                    String surName = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("ContactNumber: ");
                    String contactNumber = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    contact.add(new Data(name, surName, address, city, state, contactNumber, zip, email));
                    break;
                case 2:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter name u wont to be edit");
                    String num = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Enter new name ");
                    String newName = scan.nextLine();
                    for (int i = 0; i < contact.size(); i++) {
                        if (contact.get(i).getName().equals(num)) {

                            contact.set(i, new Data(newName, contact.get(i).getSurName(), contact.get(i).getAddress(), contact.get(i).getCity(),
                                    contact.get(i).getState(), contact.get(i).getContactNumber(), contact.get(i).getZip(), contact.get(i).getGmail()));
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < contact.size(); i++) {
                        System.out.println(contact.get(i).getName() + " " + contact.get(i).getSurName() + " " + contact.get(i).getAddress()
                                + " " + contact.get(i).getCity() + " " + contact.get(i).getState() + " " + contact.get(i).getContactNumber() +
                                " " + contact.get(i).getZip() + " " + contact.get(i).getGmail());

                    }
                    break;
                case 4:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter name you wont to be delete");
                    String number = scanner.nextLine();
                    scanner.nextLine();
                    for( int k = 0;k<contact.size();k++ ){
                        if(contact.get(k).getName().equals(number)){
                            contact.remove(contact.get(k));
                        }
                    }
                    break;
            }


        }
    }
}
