package test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public class Test6  {
    public static void main(String[] args)
    {
        String s="abccdefgbciil";

        char[] s1=s.toCharArray();
        HashMap<Character,Integer> hm= new HashMap<>();

        for(int i=0;i<s1.length;i++) {
            if (hm.containsKey(s1[i]))
                hm.put(s1[i],hm.get(s1[i])+1);
            else
                hm.put(s1[i],1);
        }

        Set<Character> keys=hm.keySet();
        for(Character key: keys)
        {
            System.out.println(key +" has "+ hm.get(key)+" times");

        }
    }

}
