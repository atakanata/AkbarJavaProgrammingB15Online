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
