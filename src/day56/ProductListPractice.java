package day56;

import java.util.ArrayList;
import java.util.List;

// How does contains decide you have an object you are looking for in your list ?
// it will call .equals method of that type , if it's overridden to check for content
// then it will return desired result according to the content (attributes)
// else it will always return false

// same thing for remove ? how can i remove an item from the list using remove method that accept object ?
// first it decide whether you have that object or not by checking using contain method .
// if you have it then you remove ,  if contains return false you can not remove because we cant remove what we don't have

public class ProductListPractice {


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
        // How does contains method decide whether the list contains the object we are looking for ?
        // it will internally call the equals method of that type (Product here)
        // if it return true then contains method will return true if not , return false

        // this is the target product we are checking
        Product sony = new Product("Sony TV", 499);
        boolean result = productList.contains(sony); // internally call equals to decide whether we have it
        System.out.println("Has Sony TV, with 499 or not result = " + result);
//        boolean result2 = productList.contains( new Product("Apple TV", 299)  ) ;
//        System.out.println("Has Apple TV, with 299 or not result2 = " + result2); // false , no apple

        // index of works exactly same way , it calls .equals of Product to decide where is the object
        System.out.println("productList.indexOf(sony) before = " + productList.indexOf(sony));
        // remove method will remove the object if the list contains the object
        // again this contains logic is using .equals to decide whether it exists in the list
        // if we have it we remove it(remove method return true)
        // if we don't have it do nothing (remove method return false)
        productList.remove(sony);
        // checking whether we have the Sony after calling remove method
        System.out.println("Has Sony TV after removing? = " + productList.contains(sony));
        System.out.println("productList.indexOf(sony) after = " + productList.indexOf(sony));


        // check whether we have "Sony TV", with 499
//        boolean result = false ;
//        for(Product each: productList){
//
////            if(each.getName().equals("Sony TV") && each.getPrice()==499){
////                result = true ;
////            }
//            if ( each.equals( sony  ) ){
//                result = true ;
//            }
//        }


    }


}
