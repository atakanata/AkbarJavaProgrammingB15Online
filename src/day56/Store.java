package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    // I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store object when we create one
    List<Product> allProducts;  // store has List of products

    public Store() {
        this.name = "Cybertek Store";
        // creating ArrayList object here
        // eventually we would have to do it anyway!
        this.allProducts = new ArrayList<>();
    }

    //      2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    public Store(String name, List<Product> otherList) {
        this(); // calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
    }


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=\n\t" + allProducts +
                '}';
    }
}
