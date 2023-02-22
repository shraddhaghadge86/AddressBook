package com.bridgelabz.addressbook;

import java.util.Objects;

public class Contact {
    private String name;
    private String surName;
    private String address;
    private String city;
    private String state;
    private String contactNumber;
    private String zip;
    private String gmail;

    public Contact(String name, String surName, String Address, String city, String state, String contactNumber, String zip, String gmail) {
        this.name = name;
        this.surName = surName;
        this.address = Address;
        this.city = city;
        this.state = state;
        this.contactNumber = contactNumber;
        this.zip = zip;
        this.gmail = gmail;
    }

    public Contact() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getGmail() {
        return this.gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String toStore() {
        return String.format(this.name + " " + this.surName + " " + this.address + " " + this.city + " " + this.state + " " + this.contactNumber + " " + this.zip + " " + this.gmail);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Contact)) {
            return false;
        } else {
            Contact contact = (Contact) o;
            return Objects.equals(this.name, contact.name) && Objects.equals(this.surName, contact.surName) && Objects.equals(this.address, contact.address) && Objects.equals(this.city, contact.city) && Objects.equals(this.state, contact.state) && Objects.equals(this.contactNumber, contact.contactNumber) && Objects.equals(this.zip, contact.zip) && Objects.equals(this.gmail, contact.gmail);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.surName, this.address, this.city, this.state, this.contactNumber, this.zip, this.gmail});
    }

    public String toString() {
        return "Contact{name='" + this.name + '\'' + ", surName='" + this.surName + '\'' + ", address='" + this.address + '\'' + ", city='" + this.city + '\'' + ", state='" + this.state + '\'' + ", contactNumber='" + this.contactNumber + '\'' + ", zip='" + this.zip + '\'' + ", gmail='" + this.gmail + '\'' + '}';
    }
}
