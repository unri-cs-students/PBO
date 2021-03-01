package com.sammidev.tugas2;

/**
 * Created by sammi aldhi yanto on 01/03/21.
 */


public class App {
    public static void main(String[] args) {

        // soal no 1
        Human sammiHuman = new Human("sammi", 17);
        Human donoHuman = new Human("Dono", 23);
        Human kasinoHuman  = new Human("Kasino", 20);
        Human indroHuman  = new Human("Indro", 16);

        sammiHuman.walk();
        sammiHuman.talk();

        donoHuman.walk();
        donoHuman.talk();

        kasinoHuman.walk();
        kasinoHuman.talk();

        indroHuman.walk();
        indroHuman.talk();

        // newline
        System.out.println("\n\n");

        // soal no 2
        Student sammi = new Student();
        sammi.input(100);
        sammi.input(80);
        sammi.input(90);
        sammi.input(78);
        sammi.input(99);

        Student dono = new Student();
        dono.input(100);
        dono.input(100);
        dono.input(100);
        dono.input(100);
        dono.input(100);
        dono.input(99);
        dono.input(99);

        System.out.println("Jumlah input score sammi : " + sammi.getCountInputScore());
        System.out.println("Total score sammi        : " + sammi.getScore());
        System.out.println("Rata-rata sammi          : " + sammi.calculateAve());

        System.out.println("Jumlah input score dono : " + dono.getCountInputScore());
        System.out.println("Total score dono        : " + dono.getScore());
        System.out.println("Rata-rata dono          : " + dono.calculateAve());
    }
}

// a class named Human
class Human {
    // Instance variables named name
    private String name;
    // Instance variables named age
    private int age;

    // constructor for assign name and age attribute
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // void walk() function that print ”Human (name) is walking”
    void walk() {
        System.out.println("Human (" + this.name + ")" + " is walking");
    }

    // void talk() function that print ”Human (name) is talking”
    void talk() {
        System.out.println("Human (" + this.name + ")" + " is talking");
    }
}

// a class named Student
class Student {

    // an instance variable named score
    private double score;

    // an instance variable named countInputScore for count the total input
    private int countInputScore;

    // get score
    public double getScore() {
        return score;
    }

    // get CountInputScore
    public int getCountInputScore() {
        return countInputScore;
    }

    // A void input() function that assign the score to the variable
    void input(double score) {
        this.countInputScore++;
        this.score += score;
    }

    // A double calculateAve() function that compute and return average of score
    double calculateAve() {
        return this.score / countInputScore;
    }
}

