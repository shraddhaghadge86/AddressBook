package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook addBook = new AddressBook();
        String start = "start";

        System.out.println("Welcome to Address Book Program");
        while(start.equals("start")) {
            System.out.println("if you want to add address press 1 if show address press 2");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBook.saveAddress();
                    break;
                case 2:
                    addBook.showMyAddress();
                    break;
                default:
                    System.out.println("Choose correct option ");

            }
        }
    }
}
