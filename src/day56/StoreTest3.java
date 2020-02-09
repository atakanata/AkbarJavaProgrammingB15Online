package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest3 {

    public static void main(String[] args) {


        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));

        Store s2 = new Store("Denis Store", denisList);
        System.out.println("s2 = " + s2);

        System.out.println("s2.findSumOfAllProductPrice() = " + s2.findSumOfAllProductPrice());
        System.out.println("s2.getAveragePrice() = " + s2.getAveragePrice());

        System.out.println("Most Expensive Product = " + s2.getMostExpensiveProduct());

    }


}
