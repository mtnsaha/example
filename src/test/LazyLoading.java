package test;

public class LazyLoading {

    public static void main(String[] args) {

        LazyFlower tulip= new LazyFlower("tulip",50);
        System.out.println("this is my flower tulip"+tulip);

        Integer priceWithTax=tulip.getPriceIncludingTax();
        System.out.println("price with tax: "+priceWithTax);

        System.out.println("this is my flower "+ tulip);

    }


}
