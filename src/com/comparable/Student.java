package com.comparable;
import java.lang.String;

public class Student implements Comparable<Student> {

    private int student_id;
    private String student_name;
    private String student_subject;
    private int student_age;

    @Override
    public int compareTo(Student o) {

        if(student_id==o.student_id)
            return 0;
        else if(student_id>o.student_id)
            return 1;
        else
            return -1;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_subject() {
        return student_subject;
    }

    public int getStudent_age() {
        return student_age;
    }

    public Student(int student_id, String student_name, String student_subject, int student_age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_subject = student_subject;
        this.student_age = student_age;


    }




}

