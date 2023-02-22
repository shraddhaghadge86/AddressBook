package com.bridgelabz.addressbook;

import java.util.*;


public class AddressBookMain {
        static HashMap<String, AddressBook> addressBookMap = new HashMap();
        static HashMap<String, ArrayList<Contact>> addressBookNames = new HashMap();

    public AddressBookMain() {
        }

        public static void main(String[] args) {
            AddressBook familyBook = new AddressBook();
            System.out.println("Welcome in AddressBook system");
            Scanner scanner = new Scanner(System.in);

            int operation;
            label53:
            do {
                System.out.println("1. ADD CONTACT \n2. DISPLAY All  AddressBooks  \n3 Search information of addressBook  \n4 delete contact in Address Books \n5 Display  Address Book\n6 Add new Address Book\n7. EXIT ");
                System.out.println("Enter the Operation Number");
                operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                        scanner.nextLine();
                        String name;
                        if (addressBookNames.isEmpty()) {
                            System.out.println("Creating your New Address Book ");
                            System.out.println("Enter a address book Name");
                            name = scanner.nextLine();
                            addressBookNames.put(name, familyBook.crateNewAddressBook());
                        }

                        System.out.println("your Address Book Names");
                        Iterator var9 = addressBookNames.keySet().iterator();

                        while(var9.hasNext()) {
                            name = (String)var9.next();
                            System.out.println(name);
                        }

                        System.out.println("Choice one upper address Book name");
                        name = scanner.nextLine();
                        addressBookNames.put(name, familyBook.addContact((ArrayList)addressBookNames.get(name)));
                        break;
                    case 2:
                        Iterator var10 = addressBookMap.entrySet().iterator();

                        while(true) {
                            if (!var10.hasNext()) {
                                continue label53;
                            }

                            Map.Entry<String, AddressBook> set = (Map.Entry)var10.next();
                            System.out.println((String)set.getKey() + "=" + set.getValue());
                        }
                    case 3:
                        familyBook.searchPerson(addressBookNames);
                        break;
                    case 4:
                        String addressBook = scanner.nextLine();
                        familyBook.deleteContact();
                        break;
                    case 5:
                        if (addressBookNames.isEmpty()) {
                            System.out.println("Address Book is empty !");
                        }

                        System.out.println("Choice your Address Book Name you want to print ");
                        Iterator var11 = addressBookNames.keySet().iterator();

                        String name1;
                        while(var11.hasNext()) {
                            name1 = (String)var11.next();
                            System.out.println(name1);
                        }

                        scanner.nextLine();
                        name1 = scanner.nextLine();
                        familyBook.displayMyAddressBook((ArrayList)addressBookNames.get(name1));
                        break;
                    case 6:
                        System.out.println("Enter a address book Name");
                        scanner.nextLine();
                        String name2 = scanner.nextLine();
                        addressBookNames.put(name2, familyBook.crateNewAddressBook());
                        break;
                    case 7:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Enter The Wrong Operation Number");
                }
            } while(operation != 7);

            familyBook.addAddressBookMap(familyBook);
        }

}
