package test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test7 {
public static void main(String [] args)
{


    List<Integer> numbers= Arrays.asList(1,2,3,4,4,6,7,8,9,10,11,12,13);

    System.out.println(
            numbers.stream().filter(e->e%2==0).map(e->e*2).reduce(0,Integer::sum)

    );



}



}

