package com.sammidev.tugas6;

/**
 * Created by sam on 19/04/21.
 */

public class Campus {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent_id(1);
        student.setNama("sammi");
        System.out.println(student.toString());
    }
}

class Student {
    private int student_id;
    private String nama;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", nama='" + nama + '\'' +
                '}';
    }
}
