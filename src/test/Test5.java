package test;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args){
        Map map= new HashMap<String,Integer>();
        String s= "kjhhhikgfddswee";
        String[] str=s.split("");

        for (int i=0;i<str.length;i++)
        {
            map.put(str[i],null);

        }



        System.out.println(map.keySet());
    }
}
