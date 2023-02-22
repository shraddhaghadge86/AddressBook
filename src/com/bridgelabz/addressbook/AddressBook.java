package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    PersonDetails obj = new PersonDetails();
    int count = 0;
    String arr[] = new String[70];
    public void saveAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your contacts ");
        System.out.print("Name: ");
        arr[count++]=sc.nextLine();
        System.out.print("Surname: ");
        arr[count++]=sc.nextLine();
        System.out.print("Address: ");
        arr[count++]=sc.nextLine();
        System.out.print("City: ");
        arr[count++]=sc.nextLine();
        System.out.print("State: ");
        arr[count++]=sc.nextLine();
        System.out.print("ContactNumber: ");
        arr[count++]=sc.nextLine();
        System.out.print("Email: ");
        arr[count++]=sc.nextLine();
    }
    public void showMyAddress(){
        int count =1;
        for(String add : arr){
            if (add!=null && !add.isEmpty()){
                System.out.print(add+", ");
                count++;
            }
            if(count==8){
                System.out.println();
                count=1;
            }
        }
    }
    public void saveAddress1() {
        // TODO Auto-generated method stub

    }
}
