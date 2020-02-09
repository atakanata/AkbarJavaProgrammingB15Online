package day56.tj_max;

public class OnSaleItem extends Item {

    private double discount;

    /**
     * public constructor with:
     *
     * @param name
     * @param catalogNumber
     * @param quantity
     * @param price
     */
    public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {
        //calculating the discounted price and setting it
        super(name, catalogNumber, quantity, price - (price * discount / 100));
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //"OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"

    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discount=" + discount + "%" +
                "name=" + getName() +
                "price" + getPrice() +
                '}';
    }
}
