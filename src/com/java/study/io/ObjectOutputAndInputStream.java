package com.java.study.io;

import java.io.*;

public class ObjectOutputAndInputStream {

    static class Person implements Serializable {

        private String name;
        private Address address;

        public Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    static class Address implements Serializable{

        private String street;

        public Address(String street) {
            this.street = street;
        }

        public Address() {
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Address address = new Address("hospital street");
        Person person = new Person("Jorge", address);

        try(ObjectOutputStream obj = new ObjectOutputStream(
                new FileOutputStream("/home/jorge/Desktop/person.txt"))) {

            obj.writeObject(person);

            obj.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream obj = new ObjectInputStream(
                new FileInputStream("/home/jorge/Desktop/person.txt"))) {

            Person person2 = (Person )obj.readObject();
            System.out.println(person2);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
