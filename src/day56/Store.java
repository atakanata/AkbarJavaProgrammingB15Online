package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    // I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store object when we create one
    private List<Product> allProducts;  // store has List of products


    //    2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    public Store(String name, List<Product> otherList) {
        this(); // calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
    }


    /**
     * A method to calculate the average price
     *
     * @return The Average Price
     */
    public double getAveragePrice() {
        // average is sum of the products divided by product count
        return findSumOfAllProductPrice() / getProductCount();

    }


    /**
     * It will check whether we have the product in the list
     *
     * @param p Product object to be checked
     * @return true if the list contains the product
     */
    public boolean checkIfProductExists(Product p) {
        return allProducts.contains(p);
    }

    /**
     * Find out 0 based location of the product in the store
     *
     * @param p product object to be checked
     * @return the index of the product in the list
     */
    public int indexOfProduct(Product p) {
        return allProducts.indexOf(p);
    }

    public void removeProduct(Product p) {

        if (checkIfProductExists(p) == true) {
            allProducts.remove(p);
        } else {
            System.out.println("We dont have " + p);
        }

    }

    /**
     * Display all products in human readable manner
     */
    public void displayProducts() {

        System.out.println(name + "'s Store has below product: ");
        for (Product each : allProducts) {
            System.out.println("\t each = " + each);
        }

    }

    /**
     * Counting how many products we have in the store
     *
     * @return the size of allProducts List
     */
    public int getProductCount() {

        return allProducts.size();

    }

    /**
     * This version of addProduct will directly accept ready Product object
     * so it can be added to the allProducts list
     *
     * @param p Product to be added
     */
    public void addProduct(Product p) {

        System.out.println("calling addProduct(Product p)");
        allProducts.add(p);

    }


    public Store() {
        this.name = "Cybertek Store";
        // creating ArrayList object here
        // eventually we would have to do it anyway!
        this.allProducts = new ArrayList<>();
    }


    /**
     * new List<Product> that contains only Products with price more than average
     *
     * @return new List<Product> that contains only Products with price more than average
     */
    public List<Product> getAllProductsMoreThanAveragePrice() {

        List<Product> myList = new ArrayList<>();
        double average = getAveragePrice();

        for (Product each : allProducts) {
            if (each.getPrice() > average) {
                myList.add(each);
            }
        }
        return myList;

    }


    /**
     * A method to get most expensive Product
     *
     * @return The product object with max price
     */
    public Product getMostExpensiveProduct() {

        Product maxProduct = null; // assume it's null before we actually find what we are looking for
        int max = Integer.MIN_VALUE; //int max = allProducts.get(0).getPrice();
        for (Product each : allProducts) {
            if (each.getPrice() > max) {
                max = each.getPrice();
                maxProduct = each;  // if max price found , assign maxProduct to the product with max price
            }
        }
        return maxProduct; // eventually return the product

////        int max = allProducts.get(0).getPrice();
//        // assume my max price is lowest number in integer range so it will be replaced by any price
//        int max = Integer.MIN_VALUE;
//        int maxIndex = -1; // assuming our index is -1 before we actually find it  // THIS WILL BE REPLACED ANYWAY
//
//        for (int x = 0; x < allProducts.size(); x++) {
//
//            if (allProducts.get(x).getPrice() > max) {
//                max = allProducts.get(x).getPrice();
//                maxIndex = x;
//            }
//
//        }
//        System.out.println("max = " + max);
//        return allProducts.get(maxIndex);

    }


    /**
     * Calculate the sum of all product price
     *
     * @return the sum of all products price
     */
    public int findSumOfAllProductPrice() {

        int sum = 0;
        for (Product each : allProducts) {
            sum += each.getPrice();
        }
        return sum;
    }

    /**
     * This version of addProduct will accept data that necessary to
     * create Product object so it can be eventually added to the list
     *
     * @param productName
     * @param productPrice
     */
    public void addProduct(String productName, int productPrice) {

        Product newP = new Product(productName, productPrice);
        allProducts.add(newP);
//        allProducts.add(  new Product(productName,productPrice )    );
    }


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=\n\t" + allProducts +
                '}';
    }
}
