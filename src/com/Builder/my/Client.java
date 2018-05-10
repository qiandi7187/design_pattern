package com.Builder.my;

public class Client {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("Jack").age(20).sex("男").build();
        System.out.println(person);

    }
}
