package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice_NoComment {


    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Macbook Pro", 2999));
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("Macbook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Iphone XL", 1299));
        productList.add(new Product("Sumsung 10", 1188));
        productList.add(new Product("Sumsung Note", 1288));


        System.out.println("productList.size() = " + productList.size());

        // check whether we have "Sony TV", with 499
        Product sony = new Product("Sony TV", 499);
        boolean result = productList.contains(sony);
        System.out.println("Has Sony TV, with 499 or not result = " + result);

        System.out.println("productList.indexOf(sony) before = " + productList.indexOf(sony));
        productList.remove(sony);

        System.out.println("Has Sony TV after removing? = " + productList.contains(sony));
        System.out.println("productList.indexOf(sony) after = " + productList.indexOf(sony));

    }


}
