package day56;

public class Product extends Object {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override // require same exact method signature
    public boolean equals(Object obj) {
        // down-casting from type Object to Product
        // because in order to access Product only field
        // we need to refer the object as Product
        Product otherProduct = (Product) obj;
        // how to compare this name and price to whatever user passed
        return this.name.equals(otherProduct.name) && this.price == otherProduct.price;
    }

//    public boolean equals(Product otherProduct) {
//
//        return this.name.equals(otherProduct.name)
//                && this.price == otherProduct.price;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
