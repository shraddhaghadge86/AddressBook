package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book System project: ");
        AddressBook addressBook = new AddressBook();
        System.out.println("--------------------------Address Book-------------------------");
        AddressBook.menuChoose();
    }

}
