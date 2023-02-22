package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook obj1 = new AddressBook();
        obj1.setName("Shraddha");
        obj1.setSurname("Ghadge");
        obj1.setAddress("Kalambi, Satara");
        obj1.setCity("Satara");
        obj1.setState("Maharastra");
        obj1.setContactNumber("8605512168");
        obj1.setEmail("shraddhaghadge86@gmail.com");

        System.out.println("Name: " + obj1.getName());
        System.out.println("Surname: " + obj1.getSurname());
        System.out.println("Address: " + obj1.getAddress());
        System.out.println("City: " + obj1.getCity());
        System.out.println("State: " + obj1.getState());
        System.out.println("ContactNumber: " + obj1.getContactNumber());
        System.out.println("Email: " + obj1.getEmail());


    }
}
