package com.sammidev.tugas3;

import java.time.LocalDateTime;

/**
 * Created by sam on 08/03/21.
 */
public class App2 {
    public static void main(String[] args) {

        // instances
        Student sam       = new Student("2003113111", "Sammi", "Ilmu Komputer", "sammi@gmail.com");
        Student dandi     = new Student("200311112", "Dandi", "Ilmu Komputer", "dandi@yahoo.com");
        Student ayatullah = new Student("200311113", "Ayatullah", "Ilmu Komputer", "ayatullah@student.com");

        // show data per instance
        System.out.println(sam.show());
        System.out.println(dandi.show());
        System.out.println(ayatullah.show());

        // show total Student
        System.out.println("total Student: " + Student.getTotalMahasiswa());
    }
}

class Student {

    // Class Variables (Static Fields)
    private static int totalMahasiswa = 1;

    // Instance Variables (Non-Static Fields)
    final int id = this.totalMahasiswa;
    String nim;
    String name;
    String major;
    String email;
    LocalDateTime createdAt;

    // no args constuctor
    Student(){
        this.totalMahasiswa++;
    }

    // all args constructor [except ID and createdAt properties]
    public Student(String nim, String name, String major, String email) {
        this.nim = nim;
        this.name = name;
        this.major = major;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.totalMahasiswa++;
    }

    // static or class method
    public static int getTotalMahasiswa() {
        return totalMahasiswa - 1;
    }

    // instance methods
    // get ID
    public int getId() {
        return this.id;
    }
    // get NIM
    public String getNim() {
        return nim;
    }
    // get Name
    public String getName() {
        return name;
    }
    // get Major
    public String getMajor() {
        return major;
    }
    // get Email
    public String getEmail() {
        return email;
    }
    // get CreatedAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // show data
    public String show() {
        return  "      ID    = " + this.getId() + "\n" +
                "      nim   = " + this.nim + "\n" +
                "      name  = " + this.name + "\n" +
                "      major = " + this.major + "\n" +
                "      email = " + this.email + "\n" +
                "      createdAt = " + this.createdAt + "\n\n";
    }
}