package com.comparable;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(105, "kunal", "history", 24));
        list.add(new Student(176, "shweta", "english", 19));
        list.add(new Student(185, "rakesh", "math", 23));
        list.add(new Student(145, "neha", "geography", 20));
        list.add(new Student(133, "anuj", "physics", 29));
        Collections.sort(list);

        System.out.println("name student_id subject age");

        for (Student st : list) {

            System.out.println(st.getStudent_name() + "  " + st.getStudent_id() + "     " + st.getStudent_subject() + " " + st.getStudent_age());
        }


    }
}
