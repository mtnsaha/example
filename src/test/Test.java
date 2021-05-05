package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {

        Student[] students = new Student[6];
        List<Student> list = new ArrayList<>();
        String st = "how are you";
        String[] split = st.split("");
        int count = 0;
        for (int i = 0; i < split.length; i++) {

            if (split[i].equals("a")||split[i].equals("e")) {
                System.out.println(split[i]);
            }
           /* if (split[i].equals("a")) {
                System.out.println(split[i]);
                count++;
            } else if (split[i].equals("e")) {
                System.out.println(split[i].toUpperCase());
                count++;
            } else if (split[i].equals("i")) {
                System.out.println(split[i]);
                count++;
            } else if (split[i].equals("o")) {
                System.out.println(split[i]);
                count++;
            } else if (split[i].equals("u")) {
                System.out.println(split[i]);
                count++;
            }*/
        }
        System.out.println("total no of vowel  " + count);
    }
}
