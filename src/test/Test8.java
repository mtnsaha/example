package test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {
public static void main(String [] args)
{
  // ArrayList<Integer> marks=new ArrayList<>();
   LinkedList<Integer> marks= new LinkedList<>();
   marks.add(66);
   marks.add(60);
   marks.add(90);
   marks.add(82);
   marks.add(26);
   marks.add(40);
   marks.add(11);
   marks.add(77);
   marks.add(18);

   System.out.println(marks.stream().filter(m->m<35).collect(Collectors.toList()));

  // System.out.println(marks.size());
}


}
