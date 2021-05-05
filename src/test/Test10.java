package test;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");



     int i=sc.nextInt();
        if(i<=2){
            System.out.println("you enter "+i+", please enter a number more than '2' ");
            System.exit(1);
        }
        System.out.print("the entered number "+i+" is a ");

        primeNumber(i);


    }

    static void primeNumber(int i){



            int flag=0;
            for(int j=3;j<i/2;j++){
                if(i%j==0)
                {
                    System.out.println("NOT PRIME");
                    flag=1;
                    break;
                }

            }
            if(flag==0){
                System.out.println("PRIME");
            }


    }
}
