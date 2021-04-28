package com.sammidev.polimorfishm;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Person person = new Student("123123","sammidev 1", 19, LocalDate.of(2001,10,20));
        Person employee = new Employee("123124","sammidev 2", 19, LocalDate.of(2001,10,20));

        System.out.println(person.toString());
        System.out.println(employee.toString());
    }
}

class Person {
    protected String name;
    protected int age;
    protected LocalDate dob;

    public Person(String name, int age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}

class Student extends Person {
    private String nim;

    public Student(String nim, String name, int age, LocalDate dob) {
        super(name, age, dob);
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", nim='" + nim + '\'' +
                '}';
    }
}

class Employee extends Person {
    private String nip;

    public Employee(String nip, String name, int age, LocalDate dob) {
        super(name, age, dob);
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", nip='" + nip + '\'' +
                '}';
    }
}