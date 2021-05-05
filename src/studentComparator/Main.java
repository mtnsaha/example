package studentComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args)

    {
        ArrayList<Student> list= new ArrayList<>();
        list.add(new Student(160,"mahesh","science",20));
        list.add(new Student(110,"shweta","arts",21));
        list.add(new Student(176,"harish","geography",19));
        list.add(new Student(108,"rupam","history",25));
        list.add(new Student(121,"amit","commerce",27));
        System.out.println("the result according to student ID");
        System.out.println("name  "+"student id"+"  subject"+"  age");
        NameCompare name= new NameCompare();
        Collections.sort(list,name);
        for (Student st:list)
        {
            System.out.println(st.getStudent_name()+"  "+st.getStudent_id()+"  "+st.getStudent_subject()+"  "+st.getStudent_age());
        }


    }
}
