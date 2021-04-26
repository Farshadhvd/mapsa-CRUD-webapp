package com.mapsa.models;


public class Student {
    private int age;
    private String name;
    private String family;
    private String sID;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public Student(int age, String name, String family, String sID) {
        this.age = age;
        this.name = name;
        this.family = family;
        this.sID = sID;
    }

    public Student() {
    }
}
