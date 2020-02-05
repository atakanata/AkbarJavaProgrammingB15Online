package day53;

public class Apple extends Fruit {

    //    String taste ;
//    String color;
    String type;

    public Apple(String taste, String color, String type) {
        super(taste, color);
        this.type = type;
    }

    @Override
    public void getDigested() {

        System.out.println(type + " apple is " + color + " color "
                + " and it has " + taste + " taste when you digest");

    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
