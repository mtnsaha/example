package com.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static public void main(String[] args){
        ArrayList<Person> list= new ArrayList<>();
        list.add(new Person("anuj","kolkata",30));
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
        for(Person p:list)
            System.out.println(p.getAddress()+p.getName()+p.getAge());

    }


}
