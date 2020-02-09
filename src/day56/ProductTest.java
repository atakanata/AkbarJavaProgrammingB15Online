package day56;

public class ProductTest {


    public static void main(String[] args) {


        Product p1 = new Product("Macbook Pro", 2999);
//        System.out.println( p1.toString() );
        Product p2 = new Product("Sony TV", 499);
        Product p3 = new Product("Sony TV", 499);

//        System.out.println("p1==p2 : " + (p1==p2)   );
//        System.out.println("p2==p3 : " + (p2==p3)   ) ;
        // equals methods is coming from Object class
        // Product extends Object so Product has equals method
        // inherited
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p3) = " + p2.equals(p3));
        System.out.println("p2.equals(p2) = " + p2.equals(p2));

        Product p4 = p3;
        System.out.println("p4.equals(p3) = " + p4.equals(p3));


        System.out.println("ABC".equals(new String("ABC")));


    }


}
