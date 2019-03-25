package com.example.gyk_3;

import java.util.ArrayList;

public class Person {
    private boolean gender; // woman : true, man : false
    private String username;
    private String accountname;

    public Person(boolean gender, String username, String accountname){
        this.gender = gender;
        this.username = username;
        this.accountname = accountname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public static ArrayList<Person> getData() {
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person(true, "Esra", "https://twitter.com/esramertturk"));
        personList.add(new Person(true, "Buse", "https://twitter.com/busegizemd"));
        personList.add(new Person(false, "Ahmet", "https://twitter.com/ahmet"));
        personList.add(new Person(true, "Sedanur", "https://twitter.com/sedanursurmen"));
        personList.add(new Person(false, "Ronaldo", "https://twitter.com/cristiano"));
        personList.add(new Person(false, "Kıvanç", "https://twitter.com/kivanctatlitug"));
        personList.add(new Person(true, "Seda", "https://twitter.com/sedaaggez"));
        personList.add(new Person(true, "Buse", "https://twitter.com/busegizemd"));
        personList.add(new Person(false, "Ahmet", "https://twitter.com/ahmet"));
        personList.add(new Person(true, "Sedanur", "https://twitter.com/sedanursurmen"));
        personList.add(new Person(false, "Ronaldo", "https://twitter.com/cristiano"));
        personList.add(new Person(false, "Kıvanç", "https://twitter.com/kivanctatlitug"));
        personList.add(new Person(true, "Seda", "https://twitter.com/sedaaggez"));
        return personList;
    }
}