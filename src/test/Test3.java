package test;

public class Test3 {
    public static void main(String[] args) {
        String s = "abccde";

        String[] s2 = s.split("");
        String[] s3 = new String[s2.length];

        for (int i = 0; i < s2.length; i++) {
            int count = 1;

            for (int j = i + 1; j < s2.length; j++) {
                if (s2[i].equals(s2[j]))
                    count++;
                s3[i] = s2[i];
            }
            for (int j = 0; j < i; j++) {
                if (s3[j].equals(s2[i])) {
                    count--;
                }
            }
            if (count != 0)
                System.out.println("no of " + s2[i] + " is " + count);
        }


    }


}
