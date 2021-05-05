package test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(70);
        list.add(17);
        list.add(73);
        list.add(74);
        list.add(37);

        /*for(Integer i:list)
            System.out.println(i);*/

list.forEach(n-> System.out.println(n));
    }

}
