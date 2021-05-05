package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(3,5,8,9,11,78,74,55,77,88);

        list.stream().filter(i->i%2==0).forEach(System.out::println);
        System.out.println("after multiplying each even element with two");

        //list.stream().filter(i->i%2==0).map(m->m*2).forEach(System.out::println);
        list.stream().filter(i->i%2==0).map(m->m*2).forEach(a->System.out.println(a));

        List list2=  list.stream().filter(i->i%2==0).map(m->m*2).collect(Collectors.toList());
        System.out.println("after");
        System.out.println(list2);






    }
}
